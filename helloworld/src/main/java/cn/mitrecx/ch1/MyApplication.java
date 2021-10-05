package cn.mitrecx.ch1;

import cn.mitrecx.ch1.di.DiConfig;
import cn.mitrecx.ch1.di.FunctionServiceUser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);

        FunctionServiceUser fsu = context.getBean(FunctionServiceUser.class);

        System.out.println(fsu.sayHello("Rosie"));

        context.close();
    }
}
