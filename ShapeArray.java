// Driver class
public class ShapeArray {
    public static void main(String[] args) {
        // Create instances
        Shape sphere = new Sphere(5);
        Shape cylinder = new Cylinder(4, 7);
        Shape cone = new Cone(3, 6);
        
        // Store instances in an array
        Shape[] shapeArray = {sphere, cylinder, cone};
        
        // Loop through and print object data
        for (Shape shape : shapeArray) {
            System.out.println(shape);
        }
    }
}
