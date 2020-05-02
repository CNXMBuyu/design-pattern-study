package cn.hgy.di;

import cn.hgy.di.parser.ClassPathXmlApplicationContext;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Demo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        Class1 class1 = (Class1)applicationContext.getBean("class1");
        class1.show();

        Class2 class2 = (Class2)applicationContext.getBean("class2");
        class2.show();
    }

}
