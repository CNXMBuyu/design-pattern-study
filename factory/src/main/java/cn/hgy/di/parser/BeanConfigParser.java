package cn.hgy.di.parser;

import cn.hgy.di.BeanDefinition;

import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public interface BeanConfigParser {

    List<BeanDefinition> parse();
}
