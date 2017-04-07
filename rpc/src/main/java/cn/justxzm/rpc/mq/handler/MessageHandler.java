package cn.justxzm.rpc.mq.handler;

/**
 * Created by XZM on 2017/4/7.
 */
import javax.jms.Message;

/**
 * 消息处理器接口
 */
public interface MessageHandler {
    public void handle(Message message);
}
