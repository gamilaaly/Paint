package paint;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;


public interface ModifyingVisitor {
//Listing the visits 
	@SuppressWarnings("exports")
	void visit(Shape shape,Color c,GraphicsContext g);
	
}