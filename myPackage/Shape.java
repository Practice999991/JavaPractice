package myPackage;

public abstract class Shape {
    private String name = "unnamed";

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public abstract float getArea();

    public abstract float getPerimeter();

    public abstract void print();
}
