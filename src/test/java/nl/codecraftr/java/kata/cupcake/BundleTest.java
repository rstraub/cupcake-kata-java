package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BundleTest {

  @Test
  void shouldDescribeBundleGivenSingleProduct() {
    var cupcakeBundle = new Bundle(new Cupcake());
    var cookieBundle = new Bundle(new Cookie());

    assertThat(cupcakeBundle.description()).isEqualTo("1 🧁");
    assertThat(cookieBundle.description()).isEqualTo("1 🍪");
  }

  @Test
  void price() {
  }
}
