package cn.lilq.designmode.builder;

import org.junit.Before;
import org.junit.Test;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/6 22:49
 */
public class BuilderTest {
    Book book;

    @Before
    public void before(){
        book = Book.builder()
                .name("JAVA")
                .price(99.99)
                .build();
    }

    @Test
    public void test(){
        System.out.println(book);
    }
}
