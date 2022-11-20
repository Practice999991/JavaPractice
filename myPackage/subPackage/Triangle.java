package myPackage.subPackage;

import myPackage.Shape;

public class Triangle extends Shape {
    Line [] sides = new Line [3];

    public Triangle () {
        sides[0] = new Line();
        sides[1] = new Line();
        sides[2] = new Line();
    }
    public float getArea() {
        return (float) 0.5;
    }

    public float getPerimeter() {
        return (float) 0.3;
    }

    public void print() {
        System.out.println("Triangle " + getName());
        sides[0].print();
    }
}
