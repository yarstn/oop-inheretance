public class Square extends Rectangle {
    // Constructors
    public Square() {
        super();
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLenght(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLenght(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}