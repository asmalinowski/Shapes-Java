class Tetrahedron extends Triangle {

    private double height;

    public Tetrahedron() {
        super();
        height = 50;
    }

    public Tetrahedron(double side, double height) {
        super(side);
        this.height = height;
    }

    @Override
    public double getArea() {
        double heightOfSideTriangle = Math.sqrt(Math.pow(height, 2)
                + Math.pow(1/3 * side * Math.sqrt(3) / 2, 2));
        double areaSide = 1/2 * heightOfSideTriangle * side;

        return super.getArea() + 3 * areaSide;
    }

    public double getVolume() {
        return (1/3) * height * super.getArea();
    }

    @Override
    public String toString() {
        return "The area of the Tetrahedron is: " + getArea() + ", the volume is: " + getVolume();
    }
}
