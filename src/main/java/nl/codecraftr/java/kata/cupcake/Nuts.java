package nl.codecraftr.java.kata.cupcake;

final public class Nuts extends Topping {
  public Nuts(Consumable consumable) {
    super(consumable);
  }

  @Override
  public String name() {
    return super.name() + "🥜";
  }
}
