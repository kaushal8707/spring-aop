package com.me.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutioncalculationAspect
{
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Around("com.me.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime=System.currentTimeMillis();

        joinPoint.proceed();   //so method would execute now

        long timeTaken=System.currentTimeMillis()-startTime;
        logger.info("Time taken By {} is {}",joinPoint,timeTaken);
    }
}
