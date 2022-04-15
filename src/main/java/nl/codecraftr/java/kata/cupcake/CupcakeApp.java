package nl.codecraftr.java.kata.cupcake;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Kata Main Class.
 */
public class CupcakeApp {

  private static final NumberFormat numberFormatter = NumberFormat.getCurrencyInstance(Locale.US);

  /**
   * Cli runner.
   */
  public static void main(String[] args) {
    new CupcakeApp().presentCupcakes(List.of(
            new Sugar(new Nuts(new Chocolate(new Cupcake())))
        ))
        .forEach(System.out::println);
  }

  public List<String> presentCupcakes(List<? extends Product> products) {
    return products.stream()
        .map(Product::description)
        .collect(Collectors.toList());
  }

  public List<String> presentPrices(List<? extends Product> products) {
    return products.stream()
        .map(Product::price)
        .map(numberFormatter::format)
        .collect(Collectors.toList());
  }
}
