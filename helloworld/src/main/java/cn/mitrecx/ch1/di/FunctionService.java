package cn.mitrecx.ch1.di;

import org.springframework.stereotype.Service;

// 使用 @Service 注解声明当前类为 Spring 管理的一个 Bean.
// 在这里使用 @Component, @Service, @Repository 和 Controller 是等效的,
// 可以根据需要选用
@Service
public class FunctionService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
