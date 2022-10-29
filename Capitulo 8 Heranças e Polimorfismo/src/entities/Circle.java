package entities;

public class Circle extends Shape{
    private Double radius;

    public Circle() {
        super();
    }
    public Circle(Color color,Double radius) {
        super(color);

    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
