package chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DevCheckInputTest {

  static CheckInput ci;

  @BeforeEach
  public void setUp() {
    ci = new CheckInput();
  }

  @Test
  public void goodInputFormat() {
    assertTrue(ci.checkCoordinateValidity("1a"));
  }

  @Test
  public void emptyInputSize() {
    assertFalse(ci.checkCoordinateValidity(""));
  }

  @Test
  public void wrongInputSize1() {
    assertFalse(ci.checkCoordinateValidity("1"));
  }

  @Test
  public void wrongInputSize2() {
    assertFalse(ci.checkCoordinateValidity("1aa"));
  }

  @Test
  public void wrongInputSize3() {
    assertFalse(ci.checkCoordinateValidity("1 a"));
  }

  @Test
  public void wrongInputFormat() {
    assertFalse(ci.checkCoordinateValidity("a1"));
  }

  @Test
  public void wrongInputFormat2() {
    assertFalse(ci.checkCoordinateValidity("bc"));
  }

  @Test
  public void wrongInputFormat3() {
    assertFalse(ci.checkCoordinateValidity("34"));
  }

  @Test
  public void rightInputFormatBeyondBoundaries1() {
    assertFalse(ci.checkCoordinateValidity("8i"));
  }
}