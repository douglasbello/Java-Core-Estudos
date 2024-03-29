package entities;

public abstract class Shape {
    protected Color color;


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape() {

    }
    public Shape(Color color) {
        this.color = color;
    }
    public abstract double area();

}
