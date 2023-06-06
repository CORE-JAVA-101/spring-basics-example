package org.example.ex5;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Employee {

  private String name;


  public Employee() {
    System.out.println("cons: "+this.getClass());
  }

  @PostConstruct
  public void start()
  {
    System.out.println("start: "+this.getClass());
  }


  public void display()
  {
    System.out.println(this.getClass());
  }
}
