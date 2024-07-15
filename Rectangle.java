public class Rectangle extends Shape{
    private double width;
    private double lenght;

    public Rectangle(String color, boolean filled, double width, double lenght) {
    this.width= 1.0;
    this.lenght=1.0;
    }

    public Rectangle(double side, double side1) {
    }

    public Rectangle() {

    }

    public void Rectangle(){

}

    public Rectangle(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
        this.lenght=lenght;

    }

    public Rectangle(double width) {
        this.width = width;
        this.lenght=lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
      double area=lenght * width;
        return area ;
    }
    public double getPerimeter(){
      double perimeter  = 2*(lenght+width); return  perimeter;
    }

    @Override
    public String toString() {
        return "Rectangl with"+  width+"and length "+ lenght +"which is subclass of: "+ super.toString();
    }
}
