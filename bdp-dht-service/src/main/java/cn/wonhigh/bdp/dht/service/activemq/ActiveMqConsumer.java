package cn.wonhigh.bdp.dht.service.activemq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * 此为activemq消费者例子
 */
@Service
public class ActiveMqConsumer {

    private Logger logger = LoggerFactory.getLogger(ActiveMqConsumer.class);

    /**
     * destination = "test.queue"
     * 这个目前还不能设置为动态，
     * 所以消费不同的消息，需要预先知道对应的消息队列名称
     * @param text
     */
    @JmsListener(destination = "test.queue")
    public void receiveQueue(String text) {


        System.out.println("Consumer收到的报文为:"+text);
    }

}
