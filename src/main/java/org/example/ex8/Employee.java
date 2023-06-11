package org.example.ex8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {


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

  public void display()
  {
    System.out.println(this.getClass());
  }
}
