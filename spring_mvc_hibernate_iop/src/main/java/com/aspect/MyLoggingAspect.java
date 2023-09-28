package com.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Around("execution(* com.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAround(ProceedingJoinPoint joinPoint)
            throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Begin of "+ methodName);
        Object targetMethodResult = joinPoint.proceed();
        System.out.println("End of" + methodName);
        return targetMethodResult;
    }
}
