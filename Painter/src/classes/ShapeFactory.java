package classes;

public class ShapeFactory{

	public static Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("LINE")) {
			return new Line();
		}
		else if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		else
			return null;
	}

}