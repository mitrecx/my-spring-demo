package cn.mitrecx.learn3commonconfig.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton") // 默认值就是 singleton, 可以省略 @Scope
@Service
public class DemoSingletonService {
}
