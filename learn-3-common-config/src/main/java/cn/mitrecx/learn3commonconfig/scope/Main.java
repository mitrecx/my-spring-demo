package cn.mitrecx.learn3commonconfig.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singleton1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singleton2 = context.getBean(DemoSingletonService.class);
        System.out.println("singleton1.equals(singleton2): " + singleton1.equals(singleton2));

        DemoPrototypeService prototype1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototype2 = context.getBean(DemoPrototypeService.class);
        System.out.println("prototype1.equals(prototype2): " + prototype1.equals(prototype2));

        context.close();
    }
}
