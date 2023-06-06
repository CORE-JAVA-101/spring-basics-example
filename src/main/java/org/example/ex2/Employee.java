package org.example.ex2;

import org.springframework.stereotype.Component;

@Component
public class Employee {

  private String name;

  public void display()
  {
    System.out.println(this.getClass());
  }
}
