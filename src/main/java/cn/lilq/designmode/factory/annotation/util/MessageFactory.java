package cn.lilq.designmode.factory.annotation.util;


import cn.lilq.designmode.factory.annotation.Message;
import cn.lilq.designmode.factory.annotation.InstanceMessage;

public class MessageFactory {
    /**
     * 根据接口实例化对象
     * @param context 环境上下文
     * @return IMessage
     */
    public static Message instanceByAnnotation(String context){
        try {
            String className = Class.forName(context).getAnnotation(InstanceMessage.class).className();
            System.out.println(className);
            return Class.forName(className).asSubclass(Message.class).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
