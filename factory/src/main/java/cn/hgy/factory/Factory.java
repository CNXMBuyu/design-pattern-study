package cn.hgy.factory;


import java.io.File;
import java.util.*;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Factory {

    public BaseClass getClass(String type) {

        List<BaseFactory> factoryList = getAllClass();
        for(BaseFactory baseFactory : factoryList) {
            if(baseFactory.handle(type)){
                return baseFactory.create();
            }
        }
        return null;
    }

    /**
     * 根据反射获取所有的工厂类
     * @return
     */
    private List<BaseFactory> getAllClass(){
        File directory = new File("D:\\codespace\\design-pattern-study\\factory\\target\\classes\\cn\\hgy\\factory");
        File[] files = directory.listFiles();

        List<BaseFactory> factoryList = new ArrayList<>();
        for (File file : files) {
            String filePath = file.getPath().replace("D:\\codespace\\design-pattern-study\\factory\\target\\classes\\", "");
            filePath = filePath.replaceAll(".class", "");
            filePath = filePath.replaceAll("\\\\", ".");

            try {
                Class clazz = Class.forName(filePath);
                if(clazz.getSuperclass() != null && clazz.getSuperclass().equals(BaseFactory.class)){
                    BaseFactory factory = (BaseFactory)Class.forName(filePath).newInstance();
                    factoryList.add(factory);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return factoryList;
    }

}
