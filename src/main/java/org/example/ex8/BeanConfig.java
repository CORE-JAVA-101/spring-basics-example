package org.example.ex8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean
  public Employee getEmployee()
  {
    return new Employee();
  }
}
