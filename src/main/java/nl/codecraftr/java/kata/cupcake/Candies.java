package nl.codecraftr.java.kata.cupcake;

final public class Candies extends Topping {

  public Candies(Consumable consumable) {
    super(consumable);
  }

  @Override
  public String description() {
    return super.description() + "🍬";
  }
}
