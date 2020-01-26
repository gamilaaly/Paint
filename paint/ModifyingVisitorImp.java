package paint;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class ModifyingVisitorImp implements ModifyingVisitor {
	@SuppressWarnings("exports")
	public void visit (Shape shape,Color c, GraphicsContext g)
	{
		//System.out.println(shape.getType());
		shape.draw(g, c);
        //shape.Original=false;
		
	}
}
