package cn.mitrecx.learn2aop.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.mitrecx.learn2aop.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
