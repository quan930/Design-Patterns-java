package cn.lilq.designmode.factory.configurationfile.impl;


import cn.lilq.designmode.factory.configurationfile.Message;

public class News implements Message {
    public void print(String string) {
        System.out.println("新闻消息:"+string);
    }
}
