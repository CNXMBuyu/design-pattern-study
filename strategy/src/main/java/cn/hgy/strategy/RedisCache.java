package cn.hgy.strategy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class RedisCache implements Cache {

    @Override
    public void addCache(String key, String content) {
        System.out.println("redis add cache; key:" + key + ", content:" + content);
    }

    @Override
    public String getCache(String key) {
        String content = "redis get key:" + key;
        System.out.println(content);
        return content;
    }
}
