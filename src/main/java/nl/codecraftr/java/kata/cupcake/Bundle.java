package nl.codecraftr.java.kata.cupcake;

import java.util.Arrays;
import java.util.List;

public final class Bundle implements Product {

  private final List<Product> products;

  public Bundle(Product... products) {
    this.products = Arrays.stream(products).toList();
  }

  @Override
  public String description() {
    return products.size() + " " + products.get(0).description();
  }

  @Override
  public double price() {
    return 0;
  }
}
