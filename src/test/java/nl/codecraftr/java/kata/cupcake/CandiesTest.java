package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CandiesTest {

  @Test
  void shouldReturnName() {
    var result = new Candies(new Cookie()).name();

    assertThat(result).isEqualTo("🍪 with 🍬");
  }
}
