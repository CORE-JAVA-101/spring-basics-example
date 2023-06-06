package org.example.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    String packageName="org.example.ex1";
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.scan(packageName);
    context.refresh();

    Company company = context.getBean(Company.class);
    Employee employee = context.getBean(Employee.class);

    company.setEmployee(employee);
    company.welcome();
  }
}
