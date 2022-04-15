package nl.codecraftr.java.kata.cupcake;

import java.util.Collections;
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
    new CupcakeApp().presentCupcakes(List.of(
            new Candies(new Nuts(new Chocolate(new Cupcake())))
        ))
        .forEach(System.out::println);
  }

  public List<String> presentCupcakes(List<Consumable> consumables) {
    return consumables.stream()
        .map(Consumable::description)
        .collect(Collectors.toList());
  }

  public List<String> presentPrices(List<Consumable> consumables) {
    return consumables.stream()
        .map(Consumable::price)
        .map(Object::toString)
        .collect(Collectors.toList());
  }
}
