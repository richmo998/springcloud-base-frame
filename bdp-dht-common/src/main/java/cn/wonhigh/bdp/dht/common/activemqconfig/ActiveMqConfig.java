package cn.wonhigh.bdp.dht.common.activemqconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.activemq")
@Component
public class ActiveMqConfig {

    private String brokerUrl;

    private boolean inMemory;

    /**
     * 这是一个测试的queue name
     * 后续如果需要使用其他队列名称，则需要在配置中心中使用，此后如果队列名称调整则直接修改配置中心，无需重启程序
     * spring.activemq.{属性名称，可以使用"-"来却别属性的驼峰}={队列名称}
     * 例如：spring.activemq.test-queue-name=test.queue
     *
     */
    private String testQueueName;

    public String getBrokerUrl() {
        return brokerUrl;
    }

    public void setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl;
    }

    public boolean isInMemory() {
        return inMemory;
    }

    public void setInMemory(boolean inMemory) {
        this.inMemory = inMemory;
    }

    public String getTestQueueName() {
        return testQueueName;
    }

    public void setTestQueueName(String testQueueName) {
        this.testQueueName = testQueueName;
    }


}
