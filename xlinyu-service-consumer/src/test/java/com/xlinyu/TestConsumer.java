package com.xlinyu;

import com.xlinyu.provider.IHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.File;

/**
 * Created by gavin on 10/08/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:dubbo-consumer.xml"})
public class TestConsumer {

    @Resource
    private IHelloService helloService;

    @Test
    public void helloWorld() {

        String message = helloService.sayHello(" 嗨美女, I'am coming....");

        System.out.println(message);
    }


}
