package cn.mitrecx.learn3commonconfig.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("cn.mitrecx.learn3commonconfig.el")
@PropertySource("cn/mitrecx/learn3commonconfig/el/test.properties")
public class ElConfig {
    // 注入普通字符串
    @Value("Hi~ Rosie.")
    private String normalStr;
    // 注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    // 注入数学表达式结果
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;
    // 注入其他 Bean 的属性
    @Value("#{demoService.another}")
    private String fromAnother;
    /**
     * 注入配置文件, 需要 {@link ElConfig#propertyConfigure()} 配合使用
     */
    @Value("${user.englishname}")
    private String name;
    /**
     * 需要和 {@link PropertySource} 注解配合使用
     */
    @Autowired
    private Environment environment;
    /**
     * 此方法需要和 {@link PropertySource} 注解配合使用
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    // 注入文件资源(流)
    @Value("classpath:cn/mitrecx/learn3commonconfig/el/test.properties")
    private Resource testFile;
    // 注入 Url 资源(html页面流)
    @Value("http://www.baidu.com")
    private Resource testUrl;

    public void outputResource() {
        try {
            System.out.println(normalStr);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(name);
            System.out.println(environment.getProperty("user.age"));
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
