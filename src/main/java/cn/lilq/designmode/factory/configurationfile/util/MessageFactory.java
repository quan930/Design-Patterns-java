package cn.lilq.designmode.factory.configurationfile.util;


import cn.lilq.designmode.factory.configurationfile.Message;

import java.util.ResourceBundle;

public class MessageFactory {
    public static Message instanceByConfigurationFile(ResourceBundle resourceBundle){
        //获取配置内容
        String className = resourceBundle.getString("MessageImpl");
        try {
            return (Message) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
