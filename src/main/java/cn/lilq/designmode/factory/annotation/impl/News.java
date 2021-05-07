package cn.lilq.designmode.factory.annotation.impl;


import cn.lilq.designmode.factory.annotation.Message;

public class News implements Message {
    public void print(String string) {
        System.out.println("新闻消息:"+string);
    }
}
