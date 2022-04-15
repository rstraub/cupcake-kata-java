package nl.codecraftr.java.kata.cupcake;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public final class Bundle implements Product {

  private final Map<String, List<Product>> groupedProducts;

  public Bundle(Product... products) {
    groupedProducts = Arrays.stream(products).collect(Collectors.groupingBy(Product::description));
  }

  @Override
  public String description() {
    return "📦 of " + groupedProducts.entrySet().stream()
        .sorted(Entry.comparingByKey())
        .map(e -> e.getValue().size() + " " + e.getKey())
        .collect(Collectors.joining(", "));
  }

  @Override
  public double price() {
    return groupedProducts.values().stream()
        .flatMapToDouble(products -> products.stream().mapToDouble(Product::price))
        .sum();
  }
}
