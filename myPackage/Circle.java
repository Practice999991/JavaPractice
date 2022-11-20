package myPackage;

public class Circle extends Shape {
    private double radius = 0.0;

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    public void print() {
        System.out.println("Circle " + getName() + ": \n\tradius: " + radius);
    }
}
