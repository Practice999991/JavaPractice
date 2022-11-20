package myPackage;

public class Rectangle extends Shape {
    // width and height are "member items" of the class Rectangle.  A member item is
    // just a formal way of saying "class variable".  We typically want variables to be 
    // private, and provide "getter" and "setter" methods (functions) to access the variables
    // so that we can change the internals of the class without having to change our code that uses
    // this class.
    private float width;
    private float height;

    // this is the default constructor.  It has the same name as the class, because it returns
    // an instance of class Rectangle.  It must be public.  It can set default values for member items,
    // or even do nothing (be empty), but it should exist.
    public Rectangle() {
        width = height = (float) 0.0;
    }

    // You can make any constructor you wish, and have it take different values in to set your member
    // items, or do some initial computation whenever a new instance of the class is constructed.
    public Rectangle(float h, float w) {
        height = h;
        width = w;
    }

    // this is a 'copy constructor' and it defines how to make a new instance of the class from
    // the provided instance 'toCopy' of class Rectangle.
    public Rectangle(Rectangle toCopy) {
        height = toCopy.getHeight();
        width = toCopy.getWidth();
    }

    // everything below here is a "member function" which is a formal way of saying function.
    // each function implements some functionality for the class

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

    // this function I named print because that is what it does.  It does not return any value to the
    // caller.  It calls system.out with the member items formatted nicely.
    // This function allows me to print the details of any instance of class Rectangle by simply calling
    // rect.print(), and not having to do System.out's everywhere in my code.
    public void print() {
        System.out.println("Rectangle " + getName() + ": \n\theight: " + height + "\n\twidth: " + width);
    }
}
