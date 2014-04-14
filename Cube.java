class Triangle extends Shape {

    protected double side;

    public Triangle() {
        side = 30;
    }

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2) * Math.sqrt(3) / 4;
    }

    @Override
    public String toString() {
        return "The area of the Triangle is: " + getArea();
    }
}
