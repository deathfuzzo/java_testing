package ru.stqa.pft.sandbox;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test


public class TestSquare {
  public void testQuad() {

    Square s = new Square(5);
    assertEquals(s.quad(), 25);
  }
}
