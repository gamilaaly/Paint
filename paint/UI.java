package paint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.util.ArrayList;

import java.util.*; 
public class UI extends Application {
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stage) {
		// Create the Canvas
		Canvas canvas = new Canvas(400, 200);
		// Set the width of the Canvas
		canvas.setWidth(400);
		// Set the height of the Canvas
		canvas.setHeight(200);
		
		// Get the graphics context of the canvas
		GraphicsContext gc = canvas.getGraphicsContext2D();
		Shape shape2 = ShapeFactory.getShape("TRIANGLE");
		Shape shape1 = ShapeFactory.getShape("LINE");
	    //Triangle t=new Triangle();
	    
	   shape2.setDimensions(new ArrayList<Integer>( Arrays.asList(90,190,10,30,170,170)));
	    System.out.println(shape2.getDimensions());
		ArrayList<Integer> Dim=shape2.getDimensions();
	    shape1.setDimensions(new ArrayList<Integer>( Arrays.asList(1,1,3)));
	    System.out.println(shape1.getDimensions());
		
	
		shape2.setColor(Color.BLUE);
		System.out.println(shape2.getColor());
		
		shape2.draw(gc, Color.BLUE);
		ModifyingVisitorImp Visitor=new ModifyingVisitorImp();
		//Visitor.visit(shape2,Color.BLACK,gc);
		Shape shape3=(Shape)shape2.clone();
	    shape3.draw(gc, Color.RED);
	    
		
		
		// Create the Pane
		Pane root = new Pane();

		// Add the Canvas to the Pane
		root.getChildren().add(canvas);
		// Create the Scene
		Scene scene = new Scene(root);
		// Add the Scene to the Stage
		stage.setScene(scene);
		// Display the Stage
		stage.show();

	}

}
