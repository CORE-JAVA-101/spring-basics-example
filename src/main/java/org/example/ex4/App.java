package org.example.ex4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    String packageName="org.example.ex4";
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.scan(packageName);
    context.refresh();

    context.registerShutdownHook(); // so that destroy or cleanup method beans will execute
  }
}
