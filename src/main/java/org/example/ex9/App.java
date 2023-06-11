package org.example.ex9;

public class App {

  public static void main(String[] args) {

    TelecomOperator operator = TelecomOperator.getInstance();
    TelecomOperator operator1 = TelecomOperator.getInstance();

    System.out.println(operator);
    System.out.println(operator1);


    BroadbandOperator operator2 = BroadbandOperator.getInstance();
    BroadbandOperator operator3 = BroadbandOperator.getInstance();
    BroadbandOperator operator4 = BroadbandOperator.getInstance();

    System.out.println(operator2);
    System.out.println(operator3);
    System.out.println(operator4);

  }
}
