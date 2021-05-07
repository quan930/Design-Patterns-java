package cn.lilq.designmode.factory.configurationfile;

import cn.lilq.designmode.factory.configurationfile.util.MessageFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.ResourceBundle;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/7 08:43
 */
public class FactoryTest {
    Message message;

    @Before
    public void before(){
        message = MessageFactory.instanceByConfigurationFile(ResourceBundle.getBundle("config"));
    }

    @Test
    public void test(){
        message.print("hello");
    }
}
