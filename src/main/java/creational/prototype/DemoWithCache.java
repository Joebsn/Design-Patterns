package creational.prototype;

import creational.prototype.cache.BundledShapeCache;
import creational.prototype.shapes.Shape;

public class DemoWithCache {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle");
        } else {
            System.out.println("Big green circle == Medium blue rectangle");
        }

        if (shape2 != shape3) {
            String result = "Medium blue rectangles are two different objects ";
            if (shape2.equals(shape3)) {
                result += "and they are identical";
            } else {
                result += "but they are not identical";
            }
            System.out.println(result);
        } else {
            System.out.println("Rectangle objects are the same");
        }
    }
}
