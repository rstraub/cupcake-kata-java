package nl.codecraftr.java.kata.cupcake;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public final class Bundle implements Product {

  private final Map<String, List<Cake>> products;

  public Bundle(Cake... cakes) {
    this.products = Arrays.stream(cakes).collect(Collectors.groupingBy(Cake::cakeName));
  }

  @Override
  public String description() {
    return products.entrySet().stream()
        .sorted(Entry.comparingByKey())
        .map(e -> e.getValue().size() + " " + e.getKey())
        .collect(Collectors.joining(", "));
  }

  @Override
  public double price() {
    return 0;
  }
}
