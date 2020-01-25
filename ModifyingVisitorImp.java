
public class ModifyingVisitorImp implements ModifyingVisitor {
	public void visit (Shape_1 shape,java.awt.Color c)
	{
		//System.out.println(shape.getType());
		shape.setColor(c);

		
	}
}
