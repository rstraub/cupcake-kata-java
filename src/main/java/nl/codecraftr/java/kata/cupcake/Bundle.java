package nl.codecraftr.java.kata.cupcake;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public final class Bundle implements Product {

  private final Map<String, List<Product>> products;

  public Bundle(Product... products) {
    this.products = Arrays.stream(products).collect(Collectors.groupingBy(Product::name));
  }

  @Override
  public String description() {
    return name() + " of " + products.entrySet().stream()
        .sorted(Entry.comparingByKey())
        .map(e -> e.getValue().size() + " " + e.getKey())
        .collect(Collectors.joining(", "));
  }

  @Override
  public double price() {
    return 0;
  }

  @Override
  public String name() {
    return "📦";
  }
}
