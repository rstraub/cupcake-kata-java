package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CookieTest {

  @Test
  void shouldReturnName() {
    assertThat(new Cookie().name()).isEqualTo("🍪");
  }
}
