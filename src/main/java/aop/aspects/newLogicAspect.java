package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class newLogicAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLogicAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLogicAdvice: в библиотеку пытаются вернуть книгу");

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("aroundReturnBookLogicAdvice: в библиотеку успешно вернули книгу");

        return targetMethodResult;
    }
}
