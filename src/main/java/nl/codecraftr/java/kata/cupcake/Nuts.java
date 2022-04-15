package nl.codecraftr.java.kata.cupcake;

final public class Nuts extends Topping {
  public Nuts(Consumable consumable) {
    super(consumable);
  }

  @Override
  public String description() {
    return super.description() + "🥜";
  }

  @Override
  public double price() {
    return super.price() + 0.2;
  }
}
