package edu.brainacad;

/**
 * Created by Admin on 07.03.2016.
 */
public class Shape {

    private String shapeColor;
    private String shapeName;
    private double area;

    public Shape(String shapeName, String shapeColor) {
        this.shapeColor = shapeColor;
        this.shapeName = shapeName;

    }

    public String getShapeName() {
        return shapeName;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "This is " + shapeName + ",color is: "
                + shapeColor;
    }

    public double calcArea(){

        return area;
    }
}