package cn.mitrecx.learn4advance.scheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("cn.mitrecx.learn4advance.scheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
