package org.example.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Company {

  @Autowired // on the variable or field, autowire by type
  private Employee employee; // reference variable

  public Company() {
    System.out.println("cons: "+this.getClass());
  }

  @PostConstruct
  public void start()
  {
    System.out.println("start: "+this.getClass());
  }

  @PreDestroy
  public void end()
  {
    System.out.println("destroy: "+this.getClass());
  }
  public void welcome()
  {
    employee.display();
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
