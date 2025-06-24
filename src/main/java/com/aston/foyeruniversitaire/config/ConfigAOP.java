package com.aston.foyeruniversitaire.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ConfigAOP {



   @Before("execution(* com.aston.foyeruniversitaire.service.*.retrieve*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Bienvenue dans le service 4TWIN2 : " + name);
    }


    @After("execution(* com.aston.foyeruniversitaire.service.*.*(..))")
    public void logMethodOut(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Execution Finie 4TWIN8 du service " + name);
    }



    // Afficher le message "Très bien!" après la bonne execution
    // de tputes les methodes public de type de retour void
    // de la couche service
    @AfterReturning("execution(public void com.aston.foyeruniversitaire.service.*.*(..))")
    public void logMethodOutOK(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Très Bien ! ");
    }


    @AfterThrowing("execution(* com.aston.foyeruniversitaire.service.*.*(..))")
    public void logMethodOutKO(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.error("Error ! ");
    }



    @Around("execution(* com.aston.foyeruniversitaire.service.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable
    {
        long start= System.currentTimeMillis();

        Object obj= pjp.proceed();

        long elapsedTime= System.currentTimeMillis() -start;

        log.info("Methodexecutiontime: " + elapsedTime+ " milliseconds.");
        return obj;
    }


}
