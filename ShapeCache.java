import java.util.Hashtable;

public class ShapeCache {
//private static Hashtable<String, Shape> shapeMap
//= new Hashtable<String, Shape>();
public static Shape_1 getShape(String shapeId) {
	Shape_1 shape1 = new Rectangle();
	Shape_1 shape2=(Shape_1) shape1.clone();
	return shape2;
}

}

