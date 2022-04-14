package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ChocolateTest {

  @Test
  void shouldReturnName() {
    var result = new Chocolate(new Cupcake()).name();

    assertThat(result).isEqualTo("🧁 with 🍫");
  }
}
