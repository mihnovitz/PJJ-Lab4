import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create shapes
        Triangle triangle = new Triangle(3, 4, 5, new Color(255, 0, 1, 255));
        Triangle triangle2 = new Triangle(6, 4, 5, new Color(255, 0, 32, 255));
        Triangle triangle3 = new Triangle(4, 4, 5, new Color(255, 234, 0, 255));
        Rectangle rectangle = new Rectangle(5, 10, new Color(15, 255, 0, 255));
        Rectangle rectangle2 = new Rectangle(6, 7, new Color(0, 255, 47, 255));
        Rectangle rectangle3 = new Rectangle(7, 13, new Color(0, 255, 78, 255));


        // Save shapes
        System.out.println("Saving shapes...");
        ShapeDao.save(triangle);
        ShapeDao.save(triangle2);
        ShapeDao.save(triangle3);
        ShapeDao.save(rectangle);
        ShapeDao.save(rectangle2);
        ShapeDao.save(rectangle3);

        // Fetch all shapes
        System.out.println("\nAll Shapes:");
        List<Shape> shapes = ShapeDao.getAllShapes();
        shapes.forEach(System.out::println);

        // Update a shape
        System.out.println("\nUpdating rectangle color...");
        rectangle.setColor(new Color(0, 0, 255, 255));
        ShapeDao.update(rectangle, rectangle.getId());

        // Fetch updated shape
        System.out.println("\nUpdated Rectangle:");
        Shape updatedRectangle = ShapeDao.getById(rectangle.getId());
        System.out.println(updatedRectangle);

        // Delete a shape
        System.out.println("\nDeleting triangle...");
        ShapeDao.deleteById(triangle.getId());

        // Final state of shapes
        System.out.println("\nFinal State of Shapes:");
        ShapeDao.getAllShapes().forEach(System.out::println);
    }
}