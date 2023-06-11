package org.example.ex8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(BeanConfig.class);
    context.scan("org.example.ex8");
//    context.refresh();
    Company company = context.getBean(Company.class);
    System.out.println(company);
    company.show();

    context.registerShutdownHook();
  }
}
