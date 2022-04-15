package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NutsTest {

  private final Nuts nuts = new Nuts(new Cookie());

  @Test
  void shouldReturnDescription() {
    var result = nuts.description();

    assertThat(result).isEqualTo("🍪 with 🥜");
  }

  @Test
  void shouldReturnPrice() {
    assertThat(nuts.price()).isEqualTo(2.2);
  }
}
