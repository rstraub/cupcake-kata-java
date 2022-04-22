package nl.codecraftr.java.kata.cupcake;

final public class Sugar extends Topping {

  public Sugar(Confectionary confectionary) {
    super(confectionary);
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
