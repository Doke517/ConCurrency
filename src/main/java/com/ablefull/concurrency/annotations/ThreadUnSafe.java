package com.ablefull.concurrency.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Daniel
 * 用于标记 [线程不安全] 类的注解
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadUnSafe {

    String value() default "";
}
