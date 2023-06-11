package org.example.ex6;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
  @Autowired
  private Employee employee;

  public void show()
  {
    employee.display();
  }
}
