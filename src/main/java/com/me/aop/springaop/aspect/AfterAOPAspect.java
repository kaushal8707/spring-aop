package com.me.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAOPAspect
{
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "execution(* com.me.aop.springaop.business.*.*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result)
    {
        logger.info("{} returned with value {}",joinPoint,result);
    }

//    @AfterThrowing(
//            value = "execution(* com.me.aop.springaop.business.*.*(..))",
//            throwing = "exception")
//    public void afterThrowing(JoinPoint joinPoint, Object exception)
//    {
//        logger.info("{} returned with value {}",joinPoint,exception);
//    }

    @After(
            value = "execution(* com.me.aop.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint)
    {
        logger.info("after execution of {}",joinPoint);
    }
}
