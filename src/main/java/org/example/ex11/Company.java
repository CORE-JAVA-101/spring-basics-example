package org.example.ex11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

  @Value("${company.name}")
  private String name;

  public String getName() {
    return name;
  }
}
