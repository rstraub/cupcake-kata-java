package nl.codecraftr.java.kata.cupcake;

final public class Cupcake implements Cake {

  private static final String name = "🧁";

  @Override
  public String description() {
    return name;
  }

  @Override
  public double price() {
    return 1.0;
  }

  @Override
  public String name() {
    return name;
  }
}
