package nl.codecraftr.java.kata.cupcake;

final public class Cookie implements Cake {

  private static final String name = "🍪";

  @Override
  public String description() {
    return name;
  }

  @Override
  public double price() {
    return 2.0;
  }
}
