package nl.codecraftr.java.kata.cupcake;

public class Chocolate implements Consumable {
  private final Consumable consumable;

  public Chocolate(Consumable consumable) {
    this.consumable = consumable;
  }

  @Override
  public String name() {
    return consumable.name() + " with 🍫";
  }
}
