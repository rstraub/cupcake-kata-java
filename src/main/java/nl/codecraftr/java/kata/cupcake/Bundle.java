package nl.codecraftr.java.kata.cupcake;

import java.util.Arrays;
import java.util.List;

public final class Bundle implements Product {

  private final List<Cake> cakes;

  public Bundle(Cake... cakes) {
    this.cakes = Arrays.stream(cakes).toList();
  }

  @Override
  public String description() {
    return cakes.size() + " " + cakes.get(0).cakeName();
  }

  @Override
  public double price() {
    return 0;
  }
}
