package cn.hgy.factory;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public interface ApplicationContext {

    Object getBean(String beanId);
}
