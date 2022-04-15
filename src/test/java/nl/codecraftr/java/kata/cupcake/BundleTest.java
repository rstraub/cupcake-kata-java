package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BundleTest {

  @Test
  void shouldDescribeBundleGivenSingleProduct() {
    var cupcakeBundle = new Bundle(new Chocolate(new Cupcake()));
    var cookieBundle = new Bundle(new Nuts(new Cookie()));

    assertThat(cupcakeBundle.description()).isEqualTo("1 🧁");
    assertThat(cookieBundle.description()).isEqualTo("1 🍪");
  }

  @Test
  void shouldDescribeBundleGivenMultiplesOfOneProduct() {
    var cupcakeBundle = new Bundle(new Cupcake(), new Cupcake());
    var cookieBundle = new Bundle(new Cookie(), new Cookie());

    assertThat(cupcakeBundle.description()).isEqualTo("2 🧁");
    assertThat(cookieBundle.description()).isEqualTo("2 🍪");
  }

  @Test
  void price() {
  }
}
