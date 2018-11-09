package com.ablefull.concurrency.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Daniel
 * 用于标记 [不推荐] 使用方式的类的写法 的注解
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface UnRecommend {

    String value() default "";
}
