package org.example.ex9;

public class BroadbandOperator {

  private static BroadbandOperator INSTANCE = new BroadbandOperator();

  private BroadbandOperator() {

    System.out.println("in default constructor: "+this);

  }

  public static BroadbandOperator getInstance() {
    return INSTANCE;
  }
}
