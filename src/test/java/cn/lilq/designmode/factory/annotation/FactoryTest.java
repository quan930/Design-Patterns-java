package cn.lilq.designmode.factory.annotation;

import cn.lilq.designmode.factory.annotation.util.MessageFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/7 08:24
 */

@InstanceMessage(className = "cn.lilq.designmode.factory.annotation.impl.News")
public class FactoryTest {
    Message message;

    @Before
    public void before(){
        message = MessageFactory.instanceByAnnotation(FactoryTest.class.getName());
    }

    @Test
    public void test(){
        message.print("hello");
    }
}
