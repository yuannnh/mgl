package fr.insalyon.telecom.mgl.RomanNumberConverter;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {

  RomanNumberConverter conv;

  @Before
  public void setup() {
    conv = new RomanNumberConverter();
  }

  @Test
  public void check() {
    assertThat(conv.convertTen(10,I,V,X))
      .isNotEmpty()
      .isEqualTo("X");
    assertThat(conv.convertTen(9,I,V,X))
      .isNotEmpty()
      .isEqualTo("IX");
    assertThat(conv.convertTen(8,I,V,X))
      .isNotEmpty()
      .isEqualTo("VIII");
    assertThat(conv.convertTen(5,I,V,X))
      .isNotEmpty()
      .isEqualTo("V");
    assertThat(conv.convertTen(4,I,V,X))
      .isNotEmpty()
      .isEqualTo("VI");
    assertThat(conv.convertTen(2,I,V,X))
      .isNotEmpty()
      .isEqualTo("II");
  }

  @Test
  public void check_invalid() {
    assertThatThrownBy(() -> conv.convertTen("A"))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessageContaining("invalid enter");
  }
}
