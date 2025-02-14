// Cone class extending Shape
class Cone extends Shape {
    private double radius;
    private double height;
    
    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    // Implement surface area method
    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }
    
    // Implement volume method
    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Cone: Surface Area = " + surface_area() + ", Volume = " + volume();
    }
}