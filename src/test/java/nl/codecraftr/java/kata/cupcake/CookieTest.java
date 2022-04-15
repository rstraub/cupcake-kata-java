package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CookieTest {

  @Test
  void shouldReturnDescription() {
    assertThat(new Cookie().description()).isEqualTo("🍪");
  }
}
