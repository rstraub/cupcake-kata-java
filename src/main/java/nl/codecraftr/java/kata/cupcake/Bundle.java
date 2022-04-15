package nl.codecraftr.java.kata.cupcake;

public final class Bundle implements Product {

  private final Product product;

  public Bundle(Product product) {
    this.product = product;
  }

  @Override
  public String description() {
    return "1 " + product.description();
  }

  @Override
  public double price() {
    return 0;
  }
}
