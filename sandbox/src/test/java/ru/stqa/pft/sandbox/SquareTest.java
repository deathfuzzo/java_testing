
package ru.stqa.pft.sandbox;

public class SquareTest {
  public void testQuad() {
    Square s = new Square(5);
    assert s.quad() == 25;
  }
}
