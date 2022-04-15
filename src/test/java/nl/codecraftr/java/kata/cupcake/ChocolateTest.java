package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ChocolateTest {

  private final Chocolate chocolate = new Chocolate(new Cupcake());

  @Test
  void shouldReturnDescription() {
    var result = chocolate.description();

    assertThat(result).isEqualTo("🧁 with 🍫");
  }

  @Test
  void shouldReturnPrice() {
    assertThat(chocolate.price()).isEqualTo(1.1);
  }
}
