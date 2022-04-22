package nl.codecraftr.java.kata.cupcake;

final public class Chocolate extends Topping {

  public Chocolate(Confectionary confectionary) {
    super(confectionary);
  }

  @Override
  public String description() {
    return super.description() + "🍫";
  }

  @Override
  public double price() {
    return super.price() + 0.1;
  }
}

