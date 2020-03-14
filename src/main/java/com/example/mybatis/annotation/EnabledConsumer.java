package com.example.mybatis.annotation;

import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(EnabledConsumerRegister.class)
public @interface EnabledConsumer {

    String appName() default "";
    String[] value() default {};
    String[] basePackages() default {};

}
