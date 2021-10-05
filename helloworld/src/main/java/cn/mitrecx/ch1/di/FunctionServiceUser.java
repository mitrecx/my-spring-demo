package cn.mitrecx.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 注解声明当前类为 Spring 管理的一个 Bean
@Service
public class FunctionServiceUser {
    // 使用 @Autowired 将 FunctionService 注入到 FunctionServiceUser 中,
    // 此处使用 @Inject 或 @Resource 是等效的.
    @Autowired
    FunctionService functionService;

    public String sayHello(String name) {
        return functionService.sayHello(name);
    }
}
