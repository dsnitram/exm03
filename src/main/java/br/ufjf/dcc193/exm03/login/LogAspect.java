package br.ufjf.dcc193.exm03.login;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
  @Before("execution(* br.ufjf.dcc193.exm03.login.LoginController.getLogin(..))")
  public void startLog(JoinPoint jp){
    System.out.println("Método iniciando:" +jp.getSignature());
    }

    @After("execution(* br.ufjf.dcc193.exm03.login.LoginController.getLogin(..))")
    public void endLog(JoinPoint jp){
      System.out.println("Método concluído:" +jp.getSignature());
      }
  
}