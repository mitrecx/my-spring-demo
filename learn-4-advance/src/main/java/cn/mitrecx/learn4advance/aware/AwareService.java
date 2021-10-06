package cn.mitrecx.learn4advance.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;


    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("Bean 的名称: " + beanName);
        Resource resource = loader.getResource(
                "classpath:cn/mitrecx/learn4advance/aware/test");
        try {
            System.out.println("ResourceLoader 加载的文件内容: "
                    + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
