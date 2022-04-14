package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;

public class CupcakeTest {

  @Test
  void shouldReturnName() {
    var result = new Cupcake().name();

    assertThat(result).isEqualTo("🧁");
  }
}
