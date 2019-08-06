public class Hometask1 {
  public static void main(String[] args) {
    Point p1 = new Point(10, 20);
    Point p2 = new Point(10, -20);
    System.out.println("Расстояние между точками p1(" + p1.x + "," + p1.y + ") и p2(" + p2.x + "," + p2.y + ") равно " + p1.distance(p1, p2));
  }
}


