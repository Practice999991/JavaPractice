package myPackage;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle() {
        width = height = (float) 0.0;
    }

    public Rectangle(float h, float w) {
        height = h;
        width = w;
    }

    public void setHeight(float h) {
        height = h;
    }

    public void setWidth(float w) {
        width = w;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getArea() {
        return height * width;
    }

    public float getPerimeter() {
        return (2 * height) + (2 * width);
    }
}
