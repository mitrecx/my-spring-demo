package cn.mitrecx.learn3commonconfig.prepost;

public class BeanWayService {
    public BeanWayService() {
        System.out.println("BeanWayService 构造方法执行");
    }

    public void init() {
        System.out.println("BeanWayService init.....");
    }

    public void destroy() {
        System.out.println("BeanWayService destroy.....");
    }
}
