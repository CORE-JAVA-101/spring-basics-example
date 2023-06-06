package org.example.basics;

public class App1 {

  public static void main(String[] args) {
    Employee employee = new Employee();
    Company company = new Company();

    company.setEmployee(employee);
    company.welcome();
  }
}
