import java.lang.System;

import myPackage.Circle;
import myPackage.Rectangle;
import myPackage.Shape;
import myPackage.subPackage.Triangle;

public class App {

    public static void main (String[] args) {
        // create a new, empty instance of class Rectangle, named r1
        Rectangle r1 = new Rectangle();

        // print out the area of r1
        System.out.println("Rect default area = " + r1.getArea());
 
        // create an instance of Rectangle with h+w of 2,2 and print it
        Rectangle r2 = new Rectangle((float) 2.0, (float) 2.0);
        System.out.println("Rect 2x2 area = " + r2.getArea());
        System.out.println("Rect 2x2 peri = " + r2.getPerimeter());

        // make a copy of r2 and name it r3.  Then set a name and call the 
        // print() member function of the class.
        Rectangle r3 = new Rectangle(r2);
        r3.setName("BOB");
        r3.print();

        // here we can see r2 remains unchanged, because it does not have the name "BOB"
        r2.print();

        Circle c1 = new Circle();
        c1.print();

        // create an array of shape objects, and place rectangles and circles into the array
        Shape [] shapes = new Shape [10];
        shapes[0] = r1;
        shapes[1] = c1;
        shapes[2] = r2;
        shapes[3] = r3;
        shapes[4] = new Triangle();

        // now I can work with the more generic "shape" object, but I am limited to calling
        // the member functions of class Shape (I cannot call rectangle-only functions on a Shape)
        for(int i = 0; i < 5; i++) {
            System.out.println("Next Shape area is: " + shapes[i].getArea());
            shapes[i].print();
        }
    }    
}