package com.leojack.aop;


import com.leojack.exception.ApiAccessException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author leojack
 * @message 通过aop+shiro控制Api访问权限
 */
@Component
@Aspect
@Slf4j
public class ApiManagement {


    @Pointcut("@annotation(com.leojack.annotation.ApiAccess)")
    public void matchCondition() {}

    //使用matchCondition这个切入点进行增强
    @Before("matchCondition()")
    public void before(JoinPoint joinPoint) {
        log.info("开始检查接口权限===============>");
        //TODO 后期接入shiro,来获取用户权限
        throw new ApiAccessException("当前角色无权访问接口"+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }
}
