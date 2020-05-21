package com.example.redisdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class JedisConfig {

    @Value("${spring.redis.host}")
    private static String host;

    @Bean
    public Jedis getJedis(){
        return new Jedis("192.168.226.136",6379);
    }
}
