package ru.stqa.pft.sandbox;

public class MyFirstProgram {


    public static void main(String[] args) {
        hello("xyu");
        hello("pizda");
        hello("Djigurda");

        Square s = new Square(5);

        Rectangle r = new Rectangle(10,8);

        String something1 = "Площадь квадрата со стороной " + s.l + " =" ;
        System.out.println(something1 + " " + s.quad() + " а площадь прямоугольника со сторонами " + r.l + " и " + r.w + " = " + r.rectangle()  );
    }
    public static void hello(String a) {
        System.out.println("Hello, "+ a + "!");
    }


}