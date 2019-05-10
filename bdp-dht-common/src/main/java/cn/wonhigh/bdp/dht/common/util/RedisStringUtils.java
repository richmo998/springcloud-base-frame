package cn.wonhigh.bdp.dht.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * redis string操作工具类
 * 作用：只处理key和value都是string类型的数据
 * 操作更加简单，配置gson来转换string方便快捷
 */
@Component
public class RedisStringUtils {

    @Autowired
    private StringRedisTemplate template;


    public void setKey(String key,String value){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value);
    }

    public String getValue(String key){
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(key);
    }

    public void setKey(String key,String value,long expire){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value,expire);
    }

    public void delete(String key){
        template.delete(key);
    }

}