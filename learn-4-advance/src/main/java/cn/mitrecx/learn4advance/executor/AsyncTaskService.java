package cn.mitrecx.learn4advance.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async // Async 注解说明该方法是一个异步方法
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务: " + i);
    }

    @Async
    public void executeAsyncTask2(Integer i) {
        System.out.println("执行异步任务2=====: " + i);
    }
}
