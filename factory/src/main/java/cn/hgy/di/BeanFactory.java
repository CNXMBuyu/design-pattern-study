package cn.hgy.di;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class BeanFactory {

    private ConcurrentHashMap<String, Object> singletonObjects = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitions = new ConcurrentHashMap<>();

    public Object getBean(String beanId) {
        Object object = singletonObjects.get(beanId);
        if (object == null) {
            BeanDefinition beanDefinition = beanDefinitions.get(beanId);
            if (beanDefinition == null) {
                throw new RuntimeException("Bean is not defined: " + beanId);
            } else {
                object = create(beanDefinition);
            }
        }
        return object;
    }

    /**
     * 加载BeanDefinition，缓存所有的BeanDefinition以及单例对象
     *
     * @param beanDefinitionList
     */
    public void loadBeanDefinitions(List<BeanDefinition> beanDefinitionList) {
        beanDefinitionList.forEach(beanDefinition -> {
            beanDefinitions.putIfAbsent(beanDefinition.getId(), beanDefinition);
        });
        beanDefinitionList.forEach(beanDefinition -> {
            if (!beanDefinition.isLazyInit() && beanDefinition.isSingleton()) {
                singletonObjects.put(beanDefinition.getId(), create(beanDefinition));
            }
        });
    }

    /**
     * 通过反射，创建具体对象
     *
     * @param beanDefinition
     * @return
     */
    public Object create(BeanDefinition beanDefinition) {

        if (beanDefinition.isSingleton() && singletonObjects.contains(beanDefinition.getId())) {
            return singletonObjects.get(beanDefinition.getId());
        }

        Object bean = null;
        try {
            Class beanClass = Class.forName(beanDefinition.getClassName());
            if (beanDefinition.getConstructorArgs() == null) { // 无参构造函数
                bean = beanClass.newInstance();
            } else {// 构造函数
                List<BeanDefinition.ConstructorArg> args = beanDefinition.getConstructorArgs();
                Class[] argClasses = new Class[args.size()];
                Object[] argObjects = new Object[args.size()];
                for (int i = 0; i < args.size(); i++) {
                    BeanDefinition.ConstructorArg constructorArg = args.get(i);
                    if (constructorArg.isRef()) {
                        // 从已有的去获取，如果不存在则直接抛出异常
                        BeanDefinition refBeanDefinition = beanDefinitions.get(constructorArg.getRef());
                        if (refBeanDefinition == null) {
                            throw new RuntimeException("Bean is not defined: " + constructorArg.getRef());
                        }
                        argClasses[i] = Class.forName(refBeanDefinition.getClassName());
                        argObjects[i] = create(refBeanDefinition);
                    } else {
                        argClasses[i] = constructorArg.getType();
                        argObjects[i] = constructorArg.getValue();
                    }
                }
                bean = beanClass.getConstructor(argClasses).newInstance(argObjects);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
