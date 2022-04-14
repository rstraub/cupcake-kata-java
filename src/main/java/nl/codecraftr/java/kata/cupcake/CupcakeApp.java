package nl.codecraftr.java.kata.cupcake;

import java.util.List;

/**
 * Kata Main Class.
 */
public class CupcakeApp {

  /**
   * Cli runner.
   */
  public static void main(String[] args) {
    new CupcakeApp().presentCupcakes().forEach(System.out::println);
  }

  public List<String> presentCupcakes() {
    return List.of("🧁");
  }
}
