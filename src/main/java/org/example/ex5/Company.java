package org.example.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Company {

  private Employee employee; // reference variable

  // constructor injection
  @Autowired
  public Company(Employee employee) {
    System.out.println("cons: "+this.getClass());
    this.employee = employee;
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


}
