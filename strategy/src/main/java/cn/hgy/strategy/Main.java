package cn.hgy.strategy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Cache redisCache = new CacheFactory().getCache("redis");
        redisCache.addCache("a", "a content");
        redisCache.getCache("a");

        Cache memoryCache = new CacheFactory().getCache("memory");
        memoryCache.addCache("a", "a content");
        memoryCache.getCache("a");
    }
}
