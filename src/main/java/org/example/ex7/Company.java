package org.example.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
  @Autowired
  private Employee employee;

  public void show()
  {
    employee.display();
  }
}
