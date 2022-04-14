package nl.codecraftr.java.kata.cupcake;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;

public class CupcakeTest {

  @Test
  void shouldUnitTest() {
    CupcakeApp.main(new String[0]);

    assertThat(true).isTrue();
  }
}
