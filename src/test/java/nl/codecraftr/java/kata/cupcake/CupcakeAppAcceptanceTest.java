package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class CupcakeAppAcceptanceTest {

  @Test
  void shouldReturnReadableConsumables() {
    var products = List.of(
        new Cupcake(),
        new Cookie(),
        new Chocolate(new Cupcake()),
        new Chocolate(new Cookie()),
        new Nuts(new Cupcake())
    );
    var expected = List.of(
        "🧁",
        "🍪",
        "🧁 with 🍫",
        "🍪 with 🍫",
        "🧁 with 🥜"
    );

    assertThat(new CupcakeApp().presentCupcakes(products)).isEqualTo(expected);
  }
}
