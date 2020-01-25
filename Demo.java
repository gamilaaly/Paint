

public class Demo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		//get an object of Circle and call its draw method.
		Shape_1 shape1 = shapeFactory.getShape("circle");
		Shape_1 shape2=(Shape_1) shape1.clone();
		System.out.println(shape1.getType());
		System.out.println(shape2.getType());
		shape1.setColor(java.awt.Color.black);
		System.out.println(shape1.getColor());
		ModifyingVisitorImp Visitor=new ModifyingVisitorImp();
		Visitor.visit(shape1,java.awt.Color.WHITE);
		System.out.println(shape1.getColor());

	}
}