package cn.mitrecx.learn4advance.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次 " + df.format(new Date()));
        try {
            Thread.sleep(6000); // 每隔 11 秒执行一次
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @Scheduled(fixedRate = 5000)
//    public void reportCurrentTime2() {
//        System.out.println("每隔5秒执行一次===== " + df.format(new Date()));
//        try {
//            Thread.sleep(6000); // 每隔 6 秒执行一次
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定的时间 " + df.format(new Date()) + " 执行");
    }
}
