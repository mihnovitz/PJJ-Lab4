import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Rectangle")
public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b, Color color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
        this(2, 5, new Color(0, 0, 0));
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}