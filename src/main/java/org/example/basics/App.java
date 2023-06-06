package org.example.basics;

public class App {

  private static String s; // reference types not initialized then default value is null
  public static void main(String[] args) {
    // short, int, float, double
    // char, long, byte, boolean
    Employee e = new Employee();
    e.display();

    Employee e1 = null;
   // e1.display(); // Null Pointer Exception

    System.out.println(s);
  }
}
