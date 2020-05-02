package cn.hgy.di.parser;

import cn.hgy.di.ApplicationContext;
import cn.hgy.di.BeanDefinition;
import cn.hgy.di.BeanFactory;
import cn.hgy.di.XmlBeanConfigParser;

import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {

    private BeanFactory beanFactory;
    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext() {
        this.beanFactory = new BeanFactory();
        this.beanConfigParser = new XmlBeanConfigParser();
        loadBeanDefinitions();
    }

    private void loadBeanDefinitions() {
        List<BeanDefinition> beanDefinitions = new XmlBeanConfigParser().parse();
        beanFactory.loadBeanDefinitions(beanDefinitions);
    }

    @Override
    public Object getBean(String beanId) {
        return beanFactory.getBean(beanId);
    }
}
