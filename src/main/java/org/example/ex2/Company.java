package org.example.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

  @Autowired
  private Employee employee; // reference variable

  public void welcome()
  {
    employee.display();
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
