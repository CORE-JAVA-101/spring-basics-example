package org.example.ex7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(BeanConfig.class);
    context.scan("org.example.ex7");
    context.refresh();
    Company company = context.getBean(Company.class);
    System.out.println(company);
    company.show();
  }
}
