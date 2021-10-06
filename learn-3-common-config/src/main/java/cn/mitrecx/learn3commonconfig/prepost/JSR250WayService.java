package cn.mitrecx.learn3commonconfig.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    public JSR250WayService() {
        System.out.println("JSR250WayService 构造方法执行");
    }

    @PostConstruct
    public void init() {
        System.out.println("JSR250WayService init.....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JSR250WayService destroy.....");
    }
}
