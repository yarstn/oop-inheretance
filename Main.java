//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("purple",false);
        System.out.println(shape1);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Circle circle = new Circle("red",true,2.0);
        System.out.println(circle);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Circle area = new Circle(5);
        System.out.println("The area of the circle [radius = " + area.getArea());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("The perimeter of the circle  = " + area.getPerimeter());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Rectangle rec = new Rectangle(4);
        System.out.println("The area of the Rectangle  = " + rec.getArea());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("The perimeter of the Rectangle  = " + rec.getPerimeter());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(rec);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Square squ = new Square(5);
        System.out.println("The side of the square  = " + squ.getWidth());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Square square = new Square(5.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea()); // Output: Area: 25.0
        System.out.println("Perimeter: " + square.getPerimeter()); // Output: Perimeter: 20.0


    }
}