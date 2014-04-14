class Sphere extends Circle {

    public Sphere() {
        super();
    }

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "The area of the Sphere is: " + getArea() + ", the volume is: " + getVolume();
    }
}
