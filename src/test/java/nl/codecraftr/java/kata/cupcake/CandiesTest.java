package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CandiesTest {

  private final Candies candies = new Candies(new Cookie());

  @Test
  void shouldReturnDescription() {
    var result = candies.description();

    assertThat(result).isEqualTo("🍪 with 🍬");
  }

  @Test
  void shouldReturnPrice() {
    assertThat(candies.price()).isEqualTo(2.15);
  }
}
