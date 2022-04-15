package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ChocolateTest {

  @Test
  void shouldReturnDescription() {
    var result = new Chocolate(new Cupcake()).description();

    assertThat(result).isEqualTo("🧁 with 🍫");
  }
}
