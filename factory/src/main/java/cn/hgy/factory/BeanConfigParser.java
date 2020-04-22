package cn.hgy.factory;

import java.io.InputStream;
import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public interface BeanConfigParser {

    List<BeanDefinition> parse();
}
