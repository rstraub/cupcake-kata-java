package nl.codecraftr.java.kata.cupcake;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Kata Main Class.
 */
public class CupcakeApp {

  /**
   * Cli runner.
   */
  public static void main(String[] args) {
    new CupcakeApp().presentCupcakes(List.of(new Cupcake()))
        .forEach(System.out::println);
  }

  public List<String> presentCupcakes(List<Cupcake> products) {
    return products.stream()
        .map(Cupcake::toString)
        .collect(Collectors.toList());
  }
}
