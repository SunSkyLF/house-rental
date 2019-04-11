package com.imooc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * session会话
 * Created by 瓦力.
 */
@Configuration//让此类成为一个配置类
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400)//让springboot自动配置redissession服务，定义生效秒数一天是86400秒
public class RedisSessionConfig {
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {

        return new StringRedisTemplate(factory);
    }
}
