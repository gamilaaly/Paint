
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
            	        	        
	        Shape shape1= new Rectangle();
	        shape1.draw(gc);
	        // Create the Pane
	        Pane root = new Pane();
	        // Set the Style-properties of the Pane
	        root.setStyle("-fx-padding: 10;" +
	                "-fx-border-style: solid inside;" +
	                "-fx-border-width: 2;" +
	                "-fx-border-insets: 5;" +
	                "-fx-border-radius: 5;" +
	                "-fx-border-color: blue;");
	        // Add the Canvas to the Pane
	        root.getChildren().add(canvas);
	        // Create the Scene
	        Scene scene = new Scene(root);
	        // Add the Scene to the Stage
	        stage.setScene(scene);
	        // Set the Title of the Stage
	        stage.setTitle("Drawing Basic Shapes on a Canvas");
	        // Display the Stage
	        stage.show(); 
	    }
}
	 