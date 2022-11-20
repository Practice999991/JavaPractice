package myPackage.subPackage;

import myPackage.Shape;

public class Line extends Shape {
    private int x1, x2, y1, y2;

    public float getArea() {
        return (float) 0.0;
    }

    public float getPerimeter() {
        return (float) (y2-y1) / (x2-x1);
    }

    public void print() {
        System.out.println("I am a line");
    }
}
