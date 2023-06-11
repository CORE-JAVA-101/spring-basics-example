package org.example.ex10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// default scope : singleton
@Scope(value = "prototype" )
public class Company {
  @Autowired
  private Employee employee;

  public void show()
  {
    employee.display();
  }
}
