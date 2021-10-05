package cn.mitrecx.learn2aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Aspect // 声明一个切面
@Component
public class TestAspect {
    // @Pointcut 用来定义切点. 这里把带有 @MyAction 注解的方法 视为切点.
    @Pointcut("@annotation(cn.mitrecx.learn2aop.aop.MyAction)")
    public void annotationPointCut() {
    }

    /**
     * After 注解用来声明一个建言, 这里使用 annotationPointCut() 定义的切点.
     * After 注解声明的建言 会在 切点执行之后 执行.
     * 换句话说, 在 切点方法 执行后, afterExecution 方法会紧接着被执行.
     */
    // @After("@annotation(cn.mitrecx.learn2aop.aop.MyAction)") // 和下面的 @After 等效
    @After("annotationPointCut()")
    public void afterExecution(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        MyAction action = method.getAnnotation(MyAction.class);
        System.out.println("After(注解式拦截): " + action.name());
    }

    /**
     * Before 注解用来声明一个建言, 这里使用 拦截参数 定义的切点. 此拦截参数表示 {@link TestService} 的所有方法.
     * 换句话说, 在 {@link TestService} 的任一方法开始执行前, 都先执行 beforeExecution 方法.
     * <p>
     * 我认为这种 "方法规则式拦截" 不好, 代码逻辑不清晰,
     * 从 {@link TestService} 类里的方法 无法直接看出方法被"篡改"了(被加了before()).
     */
    @Before("execution(* cn.mitrecx.learn2aop.aop.TestService.*(..))")
    public void beforeExecution(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("Before(方法规则式拦截): " + method.getName());
    }


}
