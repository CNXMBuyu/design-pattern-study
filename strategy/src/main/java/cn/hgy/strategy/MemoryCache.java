package cn.hgy.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class MemoryCache implements Cache {

    private ConcurrentMap<String, String> cache = new ConcurrentHashMap<>();

    @Override
    public void addCache(String key, String content) {
        cache.put(key, content);
        System.out.println("memory add cache; key:" + key + ", content:" + content);
    }

    @Override
    public String getCache(String key) {
        System.out.println("memory get key:" + key + ", content:" + cache.get(key));
        return cache.get(key);
    }
}
