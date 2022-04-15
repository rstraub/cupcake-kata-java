package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SugarTest {

  private final Sugar sugar = new Sugar(new Cookie());

  @Test
  void shouldReturnDescription() {
    var result = sugar.description();

    assertThat(result).isEqualTo("🍪 with 🍬");
  }

  @Test
  void shouldReturnPrice() {
    assertThat(sugar.price()).isEqualTo(2.15);
  }
}
