package nl.codecraftr.java.kata.cupcake;

public class Nuts implements Consumable {
  private final Consumable consumable;

  public Nuts(Consumable consumable) {
    this.consumable = consumable;
  }

  @Override
  public String name() {
    return this.consumable.name() + " with 🥜";
  }
}
