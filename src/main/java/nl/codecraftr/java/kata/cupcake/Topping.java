package nl.codecraftr.java.kata.cupcake;

sealed abstract class Topping implements Confectionary permits Sugar, Chocolate, Nuts {

  private static final String INITIAL_JOIN_WORD = "with";
  private static final String SUBSEQUENT_JOIN_WORD = "and";
  private final Confectionary confectionary;

  protected Topping(Confectionary confectionary) {
    this.confectionary = confectionary;
  }

  @Override
  public String description() {
    return this.confectionary.description()
        + " "
        + determineJoinWord()
        + " ";
  }

  private String determineJoinWord() {
    return this.confectionary.description().contains(INITIAL_JOIN_WORD) ?
        SUBSEQUENT_JOIN_WORD :
        INITIAL_JOIN_WORD;
  }

  @Override
  public double price() {
    return confectionary.price();
  }

}
