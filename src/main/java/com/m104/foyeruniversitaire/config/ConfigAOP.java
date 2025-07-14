package com.m104.foyeruniversitaire.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ConfigAOP {
   @Before("execution(* com.m104.foyeruniversitaire.service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint)
   {
        String name = joinPoint.getSignature().getName();
        log.info("In Method : " + name);
   }
    @After("execution(* com.m104.foyeruniversitaire.service.*.*(..))")
    public void logMethodOut(JoinPoint joinPoint)
    {
        String name = joinPoint.getSignature().getName();
        log.info("Out of Method : " + name);
    }
    @AfterReturning("execution(* com.m104.foyeruniversitaire.service.*.*(..))")
    public void logMethodOutOK(JoinPoint joinPoint)
    {
        String name = joinPoint.getSignature().getName();
        log.info("Out of Method with Success : " + name);
    }
    @AfterThrowing("execution(* com.m104.foyeruniversitaire.service.*.*(..))")
    public void logMethodOutKO(JoinPoint joinPoint)
    {
        String name = joinPoint.getSignature().getName();
        log.error("Out of Method with Error : " + name);
    }
    @Around("execution(* com.m104.foyeruniversitaire.service.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable
    {
        long start= System.currentTimeMillis();
        Object obj= pjp.proceed();
        long elapsedTime= System.currentTimeMillis() -start;
        log.info("Method execution time: " + elapsedTime+ " milliseconds.");
        return obj;
   }


}
