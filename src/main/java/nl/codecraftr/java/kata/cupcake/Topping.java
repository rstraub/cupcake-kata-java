package nl.codecraftr.java.kata.cupcake;

sealed abstract class Topping implements Cake permits Candies, Chocolate, Nuts {

  private static final String INITIAL_JOIN_WORD = "with";
  private static final String SUBSEQUENT_JOIN_WORD = "and";
  private final Cake product;

  protected Topping(Cake cake) {
    this.product = cake;
  }

  @Override
  public String description() {
    return this.product.description()
        + " "
        + determineJoinWord()
        + " ";
  }

  private String determineJoinWord() {
    return this.product.description().contains(INITIAL_JOIN_WORD) ?
        SUBSEQUENT_JOIN_WORD :
        INITIAL_JOIN_WORD;
  }

  @Override
  public double price() {
    return product.price();
  }
}
