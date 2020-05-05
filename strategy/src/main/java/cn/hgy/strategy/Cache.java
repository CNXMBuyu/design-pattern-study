package cn.hgy.strategy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public interface Cache {

    void addCache(String key, String content);

    String getCache(String key);
}
