package cn.hgy.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class CacheFactory {

    public Cache getCache(String type){
        String redisType = "redis";
        if(redisType.equals(type)){
            return RedisCacheSingleton.INSTANCE;
        } else {
            return MemoryCacheSingleton.INSTANCE;
        }
    }

    /**
     * 使用内部类的单例
     */
    private static class RedisCacheSingleton{
        private static RedisCache INSTANCE = new RedisCache();
    }

    /**
     * 使用内部类的单例
     */
    private static class MemoryCacheSingleton{
        private static MemoryCache INSTANCE = new MemoryCache();
    }
}
