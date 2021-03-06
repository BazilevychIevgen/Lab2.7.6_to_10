package edu.brainacad;

/**
 * Created by Admin on 08.03.2016.
 */
public class Rectangle extends Shape {

    private double widht;
    private double height;

    public Rectangle(String shapeName, String shapeColor, double height, double widht) {
        super(shapeName, shapeColor);
        this.height = height;
        this.widht = widht;
    }

    public double getWidht() {
        return widht;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calcArea() {

        double area = getHeight()* getWidht();
        System.out.println("Area is: "+ area);
        return this.getArea();
    }

    @Override
    public String toString() {
        return "This is " + this.getShapeName()+ ","+
                "color is:" + this.getShapeColor()+ ", Height = " + this.getHeight() + ", Width = "+ this.getWidht();

    }
}