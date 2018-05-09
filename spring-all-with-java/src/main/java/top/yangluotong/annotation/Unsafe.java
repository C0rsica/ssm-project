package top.yangluotong.annotation;

public @interface Unsafe {

    String value();

    String name();

    int age() default 0;
}
