package org.example.ex8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Company {
  @Autowired
  private Employee employee;

  @PostConstruct
  public void init()
  {
    System.out.println("init: "+this.getClass());
  }

  @PreDestroy
  public void destroy()
  {
    System.out.println("destroy: "+this.getClass());
  }

  public void show()
  {
    employee.display();
  }
}
