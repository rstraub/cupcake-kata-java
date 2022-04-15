package nl.codecraftr.java.kata.cupcake;

final public class Cookie implements Consumable {
  @Override
  public String description() {
    return "🍪";
  }

  @Override
  public double price() {
    return 2.0;
  }
}
