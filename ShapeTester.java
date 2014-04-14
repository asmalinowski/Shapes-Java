public class ShapeTester {
    
    public static void main(String[] args) {
        Shape [] shapes = new Shape[6];
        
        shapes[0] = new Circle();
        shapes[1] = new Sphere();
        shapes[2] = new Square();
        shapes[3] = new Cube();
        shapes[4] = new Triangle();
        shapes[5] = new Tetrahedron();
        
        for (int i = 0; i < shapes.length; i++ )
            System.out.println(shapes [i]);
    }
    
    public static float totalArea(Shape[] s){
        float acc = 0;
        
        for (int i = 0; i < s.length; i++)
            acc += s[i].getArea();
        return acc;
               
    }
}
