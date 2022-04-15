package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;

class CupcakeTest {

  @Test
  void shouldReturnDescription() {
    var result = new Cupcake().description();

    assertThat(result).isEqualTo("🧁");
  }
}
