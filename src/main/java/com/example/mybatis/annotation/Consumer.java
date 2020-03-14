package com.example.mybatis.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Consumer {

    String value() default "";

    String appName() default "";

}
