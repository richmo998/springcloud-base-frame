package cn.wonhigh.bdp.dht.common.util;

import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.jms.Destination;

/**
 * activemq 消息生产者
 */
@Component("activeMqSender")
public class ActiveMqSender {
    private Logger logger = LoggerFactory.getLogger(ActiveMqSender.class);

    /**
     *  也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
     */
    @Autowired
    private JmsMessagingTemplate jmsTemplate;


    private void sendMessage(Destination destination, final String message){
        // 发送消息，destination是发送到的队列，message是待发送的消息
        jmsTemplate.convertAndSend(destination, message);
    }

    /**
     * 发送消息
     * @param queueName
     * @param message
     */
    public void sendMessage(String queueName,String message){
        if(StringUtils.isEmpty(queueName)){
            logger.error("queueName为空,无法发送消息");
            return ;
        }
        logger.info("发送目标queue=",queueName);
        Destination destination = new ActiveMQQueue(queueName);
        sendMessage(destination,message);
    }

}
