package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;

class CupcakeTest {

  @Test
  void shouldReturnDescription() {
    var result = new Cupcake().description();

    assertThat(result).isEqualTo("🧁");
  }

  @Test
  void shouldReturnPrice() {
    assertThat(new Cupcake().price()).isEqualTo(1.0);
  }

  @Test
  void shouldReturnName() {
    var result = new Cupcake().name();

    assertThat(result).isEqualTo("🧁");
  }
}
