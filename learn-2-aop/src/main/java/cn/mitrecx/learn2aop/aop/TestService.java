package cn.mitrecx.learn2aop.aop;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public void method1() {
        System.out.println("execute first method..");
    }

    @MyAction(name = "自定义注解")
    public void method2() {
        System.out.println("execute second method..");
    }
}
