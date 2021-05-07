package cn.lilq.designmode.factory.annotation.impl;


import cn.lilq.designmode.factory.annotation.Message;

public class Email implements Message {
    public void print(String string) {
        System.out.println("邮件消息:"+string);
    }
}
