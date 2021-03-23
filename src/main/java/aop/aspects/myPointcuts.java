package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class myPointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}
}
