package org.example.ex6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean
  public Company getCompany()
  {
    return new Company();
  }

  @Bean
  public Employee getEmployee()
  {
    return new Employee();
  }
}
