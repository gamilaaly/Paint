package paint;

import java.util.Hashtable;

public class ShapeCache {
//private static Hashtable<String, Shape> shapeMap
//= new Hashtable<String, Shape>();
public static Shape getShape(String shapeId) {
	Shape shape1 = new Rectangle();
	Shape shape2=(Shape) shape1.clone();
	return shape2;
}

}
