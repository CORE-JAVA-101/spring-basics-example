package org.example.ex10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

  @Bean
//  @Scope(value = "prototype")
  public Employee getEmployee()
  {
    return new Employee();
  }
}
