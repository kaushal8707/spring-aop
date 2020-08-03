package com.me.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig
{
    @Pointcut("execution(* com.me.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() { }

    @Pointcut("execution(* com.me.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() { }
}
