package com.example.mybatis.factory;

import com.example.mybatis.config.ConsumerConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import java.lang.reflect.Proxy;

/**
 * Created by xuexuxu on 2020-03-13
 */
public class ConsumerFactoryBean implements FactoryBean<Object>, InitializingBean {


    @Autowired(required = false)
    private ConsumerConfig consumerConfig;

    private String ip;

    private String appName;

    private Class<?> type;

    @Value("${consumer.ip}")
    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public Object getObject() throws Exception {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{this.type},
                (proxy, method, args) -> "proxy method...");
    }

    @Override
    public Class<?> getObjectType() {
        return this.type;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if(null == consumerConfig){
            System.out.println("========consumerConfig is null ");
        }else {
            System.out.println("========consumerConfig is not null ");
        }
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}