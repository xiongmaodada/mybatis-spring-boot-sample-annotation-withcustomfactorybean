package com.example.mybatis.consumer;

import com.example.mybatis.annotation.Consumer;


@Consumer(appName = "consumer-demo")
public interface ConsumerDemo {

    public Integer testInteger();

}