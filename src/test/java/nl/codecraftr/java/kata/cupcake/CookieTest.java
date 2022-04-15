package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;

class CookieTest {

  @Test
  void shouldReturnDescription() {
    assertThat(new Cookie().description()).isEqualTo("🍪");
  }

  @Test
  void shouldReturnPrice() {
    AssertionsForClassTypes.assertThat(new Cookie().price()).isEqualTo(2.0);
  }
}
