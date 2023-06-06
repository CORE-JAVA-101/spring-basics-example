package org.example.ex1;

import org.springframework.stereotype.Component;

@Component
public class Company {

  private Employee employee; // reference variable

  public void welcome()
  {
    employee.display();
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
