package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BundleTest {

  @Test
  void shouldDescribeBundleGivenSingleProduct() {
    var cupcakeBundle = new Bundle(new Chocolate(new Cupcake()));
    var cookieBundle = new Bundle(new Nuts(new Cookie()));

    assertThat(cupcakeBundle.description()).isEqualTo("📦 of 1 🧁 with 🍫");
    assertThat(cookieBundle.description()).isEqualTo("📦 of 1 🍪 with 🥜");
  }

  @Test
  void shouldDescribeBundleGivenMultiplesOfOneProduct() {
    var cupcakeBundle = new Bundle(new Cupcake(), new Cupcake());
    var cookieBundle = new Bundle(new Cookie(), new Cookie());

    assertThat(cupcakeBundle.description()).isEqualTo("📦 of 2 🧁");
    assertThat(cookieBundle.description()).isEqualTo("📦 of 2 🍪");
  }

  @Test
  void shouldDescribeBundleGivenMultipleProducts() {
    var mixedBundle = new Bundle(new Cupcake(), new Cupcake(), new Cookie());

    assertThat(mixedBundle.description()).isEqualTo(
        "📦 of 1 🍪, 2 🧁"
    );
  }

  @Test
  void shouldDescribeBundleGivenBundleAndProduct() {
    var bundleOfBundle = new Bundle(
        new Bundle(new Cookie(), new Cupcake()),
        new Bundle(new Cookie(), new Cookie()),
        new Cupcake()
    );

    assertThat(bundleOfBundle.description()).isEqualTo(
        "📦 of 1 📦 of 1 🍪, 1 🧁, 1 📦 of 2 🍪, 1 🧁"
    );
  }

  @Test
  void shouldDescribeGroupedBundleGivenBundlesWithSameProduct() {
    var bundleOfBundle = new Bundle(
        new Bundle(new Cookie(), new Cupcake()),
        new Bundle(new Cupcake(), new Cookie())
    );

    assertThat(bundleOfBundle.description()).isEqualTo(
        "📦 of 2 📦 of 1 🍪, 1 🧁"
    );
  }

  // TODO
  @Test
  void price() {
  }
}
