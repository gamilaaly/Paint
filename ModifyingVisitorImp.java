
public class ModifyingVisitorImp implements ModifyingVisitor {
	public void visit (Shape shape,java.awt.Color c)
	{
		//System.out.println(shape.getType());
		shape.setColor(c);

		
	}
}
