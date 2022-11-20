import java.lang.System;
import myPackage.Rectangle;

public class App {

    public static void main (String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Rect default area = " + r1.getArea());
 
        Rectangle r2 = new Rectangle((float) 2.0, (float) 2.0);
        System.out.println("Rect 2x2 area = " + r2.getArea());
        System.out.println("Rect 2x2 peri = " + r2.getPerimeter());
    }    
}