class Square extends Shape {

    protected double side;
    public Square() {
        side = 20;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "The area of the Square is: " + getArea();
    }
}
