package org.example.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Company {

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


  // setter injection
  @Autowired // added autowired to dependent object setter method
  public void setEmployee(Employee employee) {
    System.out.println("setter for employee called");
    this.employee = employee;
  }
}
