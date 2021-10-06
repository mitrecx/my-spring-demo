package cn.mitrecx.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration 声明当前类是一个配置类, 相当于一个 Spring 配置的 xml 文件
@Configuration
// @ComponentScan 自动扫描包下 所有使用 @Service,
// @Component, @Repository, @Controller 的类,
// 并将它们注册为 Bean.
@ComponentScan("cn.mitrecx.ch1.di")
public class DiConfig {
}
