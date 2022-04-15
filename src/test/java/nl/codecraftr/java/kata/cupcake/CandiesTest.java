package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CandiesTest {

  @Test
  void shouldReturnDescription() {
    var result = new Candies(new Cookie()).description();

    assertThat(result).isEqualTo("🍪 with 🍬");
  }
}
