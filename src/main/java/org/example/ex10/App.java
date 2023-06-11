package org.example.ex10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(BeanConfig.class);
    context.scan("org.example.ex10");
    Company company = context.getBean(Company.class);
    Company company1 = context.getBean(Company.class);
    System.out.println(company);
    System.out.println(company1);
    company.show();
    company1.show();
  }
}
