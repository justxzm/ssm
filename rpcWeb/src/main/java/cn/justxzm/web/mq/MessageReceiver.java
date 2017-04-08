package cn.justxzm.web.mq;

/**
 * Created by XZM on 2017/4/8.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.justxzm.rpc.mq.util.ActiveMQP2PUtil;
import cn.justxzm.service.log.LogMessageHandler;

/**
 * 用于接收消息的测试类
 */
@Controller
@RequestMapping("/mq")
public class MessageReceiver {

    @Autowired
    private LogMessageHandler handler;

    @RequestMapping("/receive")
    public void receiveMessage() {
        ActiveMQP2PUtil.receiveMessage(handler);
    }

}