package nl.codecraftr.java.kata.cupcake;

public class Chocolate implements Consumable {

  public Chocolate(Cupcake cupcake) {
  }

  @Override
  public String name() {
    return "🍫";
  }
}
