package top.yangluotong.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;

public class RedisClient {

    public static void main(String[] args) {
//        Jedis jedis = new Jedis("localhost");



        JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
        Jedis jedis = pool.getResource();
        jedis.set("foo", "bar","xx");

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);

//        jedis.hmset("map",map);
        System.out.println(jedis);
    }



}
