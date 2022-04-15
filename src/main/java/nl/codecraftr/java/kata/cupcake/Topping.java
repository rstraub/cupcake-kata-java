package nl.codecraftr.java.kata.cupcake;

sealed abstract class Topping implements Cake permits Candies, Chocolate, Nuts {

  private static final String INITIAL_JOIN_WORD = "with";
  private static final String SUBSEQUENT_JOIN_WORD = "and";
  private final Cake cake;

  protected Topping(Cake cake) {
    this.cake = cake;
  }

  @Override
  public String description() {
    return this.cake.description()
        + " "
        + determineJoinWord()
        + " ";
  }

  private String determineJoinWord() {
    return this.cake.description().contains(INITIAL_JOIN_WORD) ?
        SUBSEQUENT_JOIN_WORD :
        INITIAL_JOIN_WORD;
  }

  @Override
  public double price() {
    return cake.price();
  }

  @Override
  public String cakeName() {
    return this.cake.cakeName();
  }
}
