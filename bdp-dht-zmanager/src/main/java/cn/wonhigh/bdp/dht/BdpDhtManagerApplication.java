package cn.wonhigh.bdp.dht;


import cn.wonhigh.bdp.dht.common.druidconfig.HiveDruidConfig;
import cn.wonhigh.bdp.dht.common.druidconfig.MybatisDruidConfig;
import cn.wonhigh.bdp.dht.common.activemqconfig.ActiveMqConfig;
import cn.wonhigh.bdp.dht.common.druidconfig.PgsqlDruidConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableConfigurationProperties({MybatisDruidConfig.class,ActiveMqConfig.class, HiveDruidConfig.class, PgsqlDruidConfig.class})
@EnableDiscoveryClient
@RefreshScope
@PropertySource("classpath:others.properties")  // 后续可以定制其他配置文件，但最好全部使用配置中心
public class BdpDhtManagerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(BdpDhtManagerApplication.class,args);

    }
}
