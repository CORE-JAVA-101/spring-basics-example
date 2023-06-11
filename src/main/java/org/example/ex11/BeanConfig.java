package org.example.ex11;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("connection.properties")
@Configuration
public class BeanConfig {
}
