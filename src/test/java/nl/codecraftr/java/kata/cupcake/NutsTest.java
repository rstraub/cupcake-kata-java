package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NutsTest {

  @Test
  void shouldReturnName() {
    var result = new Nuts(new Cookie()).name();

    assertThat(result).isEqualTo("🍪 with 🥜");
  }
}
