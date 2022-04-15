package nl.codecraftr.java.kata.cupcake;

final public class Candies extends Topping {

  public Candies(Product product) {
    super(product);
  }

  @Override
  public String description() {
    return super.description() + "🍬";
  }

  @Override
  public double price() {
    return super.price() + 0.15;
  }
}
