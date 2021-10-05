package cn.mitrecx.learn2aop;

import cn.mitrecx.learn2aop.aop.AopConfig;
import cn.mitrecx.learn2aop.aop.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        TestService methodService = context.getBean(TestService.class);

        methodService.method1();
        System.out.println("---------");
        methodService.method2();

        context.close();
    }
}
