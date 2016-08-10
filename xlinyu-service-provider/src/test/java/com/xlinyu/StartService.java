package com.xlinyu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gavin on 10/08/2016.
 */
public class StartService {


    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});

        context.start();

        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟

    }

}
