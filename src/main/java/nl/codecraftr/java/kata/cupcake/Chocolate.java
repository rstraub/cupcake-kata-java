package nl.codecraftr.java.kata.cupcake;

final public class Chocolate extends Topping {

  public Chocolate(Consumable consumable) {
    super(consumable);
  }

  @Override
  public String name() {
    return super.name() + "🍫";
  }
}
