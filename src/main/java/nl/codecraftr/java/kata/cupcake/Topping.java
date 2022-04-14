package nl.codecraftr.java.kata.cupcake;

sealed abstract class Topping implements Consumable permits Candies, Chocolate, Nuts {

  private static final String INITIAL_JOIN_WORD = "with";
  private static final String SUBSEQUENT_JOIN_WORD = "and";
  private final Consumable consumable;

  protected Topping(Consumable consumable) {
    this.consumable = consumable;
  }

  @Override
  public String name() {
    return this.consumable.name()
        + " "
        + determineJoinWord()
        + " ";
  }

  private String determineJoinWord() {
    return this.consumable.name().contains(INITIAL_JOIN_WORD) ?
        SUBSEQUENT_JOIN_WORD :
        INITIAL_JOIN_WORD;
  }
}
