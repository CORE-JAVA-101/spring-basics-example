package org.example.ex1;

import org.springframework.stereotype.Component;

@Component
public class Employee {

  private String name;

  public void display()
  {
    System.out.println(this.getClass());
  }
}
