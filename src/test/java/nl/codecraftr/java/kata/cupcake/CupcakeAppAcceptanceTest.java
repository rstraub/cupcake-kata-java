package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class CupcakeAppAcceptanceTest {

  @Test
  void shouldDescribeProducts() {
    var consumables = List.of(
        new Cupcake(),
        new Cookie(),
        new Chocolate(new Cupcake()),
        new Chocolate(new Cookie()),
        new Nuts(new Cupcake()),
        new Sugar(new Chocolate(new Cupcake())),
        new Sugar(new Nuts(new Chocolate(new Cupcake()))),
        new Bundle(new Bundle(new Cupcake(), new Cookie()), new Nuts(new Cupcake()))
    );
    var expected = List.of(
        "🧁",
        "🍪",
        "🧁 with 🍫",
        "🍪 with 🍫",
        "🧁 with 🥜",
        "🧁 with 🍫 and 🍬",
        "🧁 with 🍫 and 🥜 and 🍬",
        "📦 of 1 📦 of 1 🍪, 1 🧁, 1 🧁 with 🥜"
    );

    var result = new CupcakeApp().presentCupcakes(consumables);

    assertThat(result).isEqualTo(expected);
  }

  @Test
  void shouldPriceProducts() {
    var consumables = List.of(
        new Cupcake(),
        new Cookie(),
        new Chocolate(new Cupcake()),
        new Chocolate(new Cookie()),
        new Nuts(new Cookie()),
        new Sugar(new Cupcake()),
        new Bundle(new Bundle(new Cupcake(), new Cookie()), new Nuts(new Cupcake()))
    );

    var expected = List.of(
        "$1.00",
        "$2.00",
        "$1.10",
        "$2.10",
        "$2.20",
        "$1.15",
        "$4.20"
    );

    var result = new CupcakeApp().presentPrices(consumables);

    assertThat(result).isEqualTo(expected);
  }
}
