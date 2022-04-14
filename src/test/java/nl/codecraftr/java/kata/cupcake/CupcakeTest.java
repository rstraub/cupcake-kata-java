package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;

public class CupcakeTest {

  @Test
  void shouldReturnReadableOutput() {
    var result = new Cupcake().toString();

    assertThat(result).isEqualTo("🧁");
  }
}
