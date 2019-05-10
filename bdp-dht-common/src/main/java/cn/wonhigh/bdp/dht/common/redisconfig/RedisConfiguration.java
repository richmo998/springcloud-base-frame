package cn.wonhigh.bdp.dht.common.redisconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;

/**
 * redisTemplate配置初始化
 */
@Configuration
public class RedisConfiguration {

    /**
     * 此操作工具，需要自己
     * @param redisConnectionFactory
     * @return
     * @throws UnknownHostException
     */

    @Bean
    @ConditionalOnMissingBean(name="redisTemplate")
    public RedisTemplate<Object, Object> redisTemplate(
            RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException{
        RedisTemplate<Object, Object> template = new RedisTemplate<Object,Object>();
        //key 设置为string序列化
        template.setKeySerializer(new StringRedisSerializer());
        //也可以指定value的序列化

        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

    /**
     * 此操作工具，key和value都使用的是StringRedisSerializer序列化
     * 注意：就是key和value必须是String类型
     * 而且
     *
     * @param redisConnectionFactory
     * @return
     * @throws UnknownHostException
     */
    @Bean
    @ConditionalOnMissingBean(StringRedisTemplate.class)
    public StringRedisTemplate stringRedisTemplate(
            RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException{
        StringRedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

}