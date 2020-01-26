package paint;


import javafx.scene.paint.Color;


public class Demo {
	public static void main(String[] args) {
		
		/*
		Canvas canvas = new Canvas(400, 200);
		// Set the width of the Canvas
		canvas.setWidth(400);
		// Set the height of the Canvas
		canvas.setHeight(200);

		// Get the graphics context of the canvas
		GraphicsContext gc = canvas.getGraphicsContext2D();
		*/
		ShapeFactory shapeFactory = new ShapeFactory();
		//get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("circle");
		Shape shape2=(Shape) shape1.clone();
		System.out.println(shape1.getType());
		System.out.println(shape2.getType());
		shape1.setColor(Color.BLACK);
		System.out.println(shape1.getColor());
		ModifyingVisitorImp Visitor=new ModifyingVisitorImp();
		//Visitor.visit(shape1,Color.RED,gc);
		//shape1.accept(Visitor);
		System.out.println(shape1.getColor());
		//shape1.draw(gc);

	}
}