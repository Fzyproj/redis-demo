package com.example.redisdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

@SpringBootTest
class RedisDemoApplicationTests {

    @Autowired
    private Jedis jedis;

    @Test
    void testJedis(){
        String a = jedis.set("a", "1111");
        System.out.println("返回存入的结果状态"+a);
        String s = jedis.get("a");
        System.out.println("读取key对应的value值哦"+s);
        String b = jedis.set("b", "222");

    }
}
