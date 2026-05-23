package creational.prototype;

import creational.prototype.shapes.Circle;
import creational.prototype.shapes.Rectangle;
import creational.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes);
    }

    private static void cloneAndCompare(List<Shape> shapes) {
        List<Shape> shapesCopy = new ArrayList<>();

        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                String result = ": Shapes are different objects ";
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    result += "and they are identical";
                } else {
                    result += "and they are not identical";
                }
                System.out.println(i + result);
            } else {
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }
}