package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /This is a new comment in javadoc comment
  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
