
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


class UI extends Application{
	  public static void main(String[] args) 
	    {
	        Application.launch(args);
	        //Shape_1 shape1 = ShapeFactory.getShape("Rectangle");

	    }

	  @Override
	    public void start(Stage stage) 
	    {
		// Create the Canvas
	        Canvas canvas = new Canvas(400, 200);
	        // Set the width of the Canvas
	        canvas.setWidth(400);
	        // Set the height of the Canvas
	        canvas.setHeight(200);
	         
	        // Get the graphics context of the canvas
	        GraphicsContext gc = canvas.getGraphicsContext2D();
	        Shape_1 shape2=new Rectangle();
            
	        shape2.draw(gc);
		  
		  
	    }
	  
	  

}
