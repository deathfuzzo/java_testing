package ru.stqa.pft.sandbox;

public class Rectangle {
  int l;
  int w;

  public Rectangle(int l, int w) {
    this.l = l;
    this.w = w;
  }

  public int rectangle() {
    return this.l * this.w;
  }
}
