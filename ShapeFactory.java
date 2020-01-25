public class ShapeFactory{

	public Shape_1 getShape(String shapeType) {
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
		else
			return null;
	}

}