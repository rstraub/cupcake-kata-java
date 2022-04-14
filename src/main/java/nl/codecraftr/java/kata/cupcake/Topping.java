package nl.codecraftr.java.kata.cupcake;

sealed abstract class Topping implements Consumable permits Candies, Chocolate, Nuts {

  private final Consumable consumable;

  protected Topping(Consumable consumable) {
    this.consumable = consumable;
  }

  @Override
  public String name() {
    return this.consumable.name() + " with ";
  }
}
