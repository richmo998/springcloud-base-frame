package cn.wonhigh.bdp.dht.controller;

import cn.wonhigh.bdp.dht.common.activemqconfig.ActiveMqConfig;
import cn.wonhigh.bdp.dht.common.druidconfig.MybatisDruidConfig;
import cn.wonhigh.bdp.dht.common.dto.ResultMsgDto;
import cn.wonhigh.bdp.dht.common.model.ApplicationInfo;
import cn.wonhigh.bdp.dht.common.util.ActiveMqSender;
import cn.wonhigh.bdp.dht.common.util.JSONUtil;
import cn.wonhigh.bdp.dht.service.ApplicationInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 作用：restful接口
 * 处理所有关于静态数据功能接口
 * 接口格式： /{模块名}/{处理对象}/{方法名称}
 * 例如： /task/data/DataCleaningTaskImpl
 */
@RestController
@RequestMapping("/task/data")
public class DataTaskController {

    private Logger logger = LoggerFactory.getLogger(DataTaskController.class);
    @Autowired
    ActiveMqSender activeMqSender;

    @Autowired
    ApplicationInfoService applicationInfoService;

    @Autowired
    ActiveMqConfig activeMqConfig;
    @Autowired
    MybatisDruidConfig mybatisDruidConfig;

    @GetMapping(value = "/test")
    public  String testHello(@RequestParam String msg){

        //发送队列名称可以动态的从配置中心获取
        String queueName = activeMqConfig.getTestQueueName();
        //发送activemq消息
        activeMqSender.sendMessage(queueName,msg);


        //标准json返回格式：所有参数为Object类型，方便扩展
        //最终需要用JSONUtil进行格式化返回
        ResultMsgDto resultMsgDto = new ResultMsgDto("0","","发送消息成功："+msg);
        return JSONUtil.toJson(resultMsgDto);
    }

    @GetMapping(value = "/getYarnApplicationInfo")
    public String getYarnApplicationInfo(@RequestParam String appName){

        List<ApplicationInfo> list =null;
        try {
             list = applicationInfoService.selectByAppNameList(appName);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //标准json返回格式：所有参数为Object类型，方便扩展
        //最终需要用JSONUtil进行格式化返回
        ResultMsgDto resultMsgDto = new ResultMsgDto("0","",null==list?"no app info.":list.toString());
        return JSONUtil.toJson(resultMsgDto);
    }


}
