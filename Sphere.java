// Sphere class extending Shape
class Sphere extends Shape {
    private double radius;
    
    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    // Implement surface area method
    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    // Implement volume method
    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
    
    // toString method
    @Override
    public String toString() {
        return "Sphere: Surface Area = " + surface_area() + ", Volume = " + volume();
    }
}