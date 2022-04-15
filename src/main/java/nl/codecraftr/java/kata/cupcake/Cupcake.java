package nl.codecraftr.java.kata.cupcake;

final public class Cupcake implements Cake {

  @Override
  public String description() {
    return "🧁";
  }

  @Override
  public double price() {
    return 1.0;
  }
}
