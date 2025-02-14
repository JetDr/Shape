// Cylinder class extending Shape
class Cylinder extends Shape {
    private double radius;
    private double height;
    
    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    // Implement surface area method
    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    // Implement volume method
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Cylinder: Surface Area = " + surface_area() + ", Volume = " + volume();
    }
}
