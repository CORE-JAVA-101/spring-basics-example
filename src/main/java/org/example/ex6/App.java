package org.example.ex6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(BeanConfig.class);
    Company company = context.getBean(Company.class);
    System.out.println(company);
    company.show();
  }
}
