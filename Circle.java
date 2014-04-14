class Circle extends Shape {

    protected double radius;

    public Circle() {
        radius = 5;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "The area of the Circle is: " + getArea();
    }
}
