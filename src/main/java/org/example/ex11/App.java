package org.example.ex11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.scan("org.example.ex11");
    context.refresh();

    Company company = context.getBean(Company.class);
    System.out.println(company.getName());
  }
}
