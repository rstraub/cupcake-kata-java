package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CupcakeAppIT {
  @Test
  void shouldReturnReadableCupcakes() {
    var products = List.of(new Cupcake(), new Cupcake());
    var expected = List.of("🧁", "🧁");

    assertThat(new CupcakeApp().presentCupcakes(products)).isEqualTo(expected);
  }
}
