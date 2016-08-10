package com.xlinyu.provider;

/**
 * Created by gavin on 09/08/2016.
 */
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello Dubbo,Hello " + name;
    }

}
