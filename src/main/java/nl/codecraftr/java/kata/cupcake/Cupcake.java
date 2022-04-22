package nl.codecraftr.java.kata.cupcake;

final public class Cupcake implements Confectionary {

  private static final String name = "🧁";

  @Override
  public String description() {
    return name;
  }

  @Override
  public double price() {
    return 1.0;
  }
}
