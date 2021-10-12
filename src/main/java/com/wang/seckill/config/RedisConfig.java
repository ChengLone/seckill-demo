package com.wang.seckill.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * redis配置类
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        //key序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //value序列化
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        //hash类型key序列化
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        //hash类型value
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

        //注入连接工厂
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }

    //@Bean
    //public Redisson redisson(){
    //    Config config = new Config();
    //    config.useSingleServer().setAddress("redis://192.168.159.200:6379").setDatabase(0);
    //    return (Redisson) Redisson.create(config);
    //}

    @Bean
    public DefaultRedisScript<Long> defaultRedisScript() {
        DefaultRedisScript<Long> redisScript = new DefaultRedisScript<>();
        //lock.lua脚本的位置和application.yml同级目录
        redisScript.setLocation(new ClassPathResource("stock.lua"));
        //设置返回结果类型
        redisScript.setResultType(Long.class);
        return redisScript;
    }
}
