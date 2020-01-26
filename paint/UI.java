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
		Canvas canvas = new Canvas(400, 400);
		// Set the width of the Canvas
		canvas.setWidth(400);
		// Set the height of the Canvas
		canvas.setHeight(400);
		
		// Get the graphics context of the canva
		GraphicsContext gc = canvas.getGraphicsContext2D();
		Shape shape2 = ShapeFactory.getShape("TRIANGLE");
		Shape shape1 = ShapeFactory.getShape("LINE");
		Shape square=ShapeFactory.getShape("SQUARE");
	    Shape circle=ShapeFactory.getShape("CIRCLE");
		Shape rectangle=ShapeFactory.getShape("RECTANGLE");

		square.setDimensions(new ArrayList<Integer>(Arrays.asList(200,0,100)));
		square.draw(gc, Color.AQUA);
		
		circle.setDimensions(new ArrayList<Integer>(Arrays.asList(50,250,100)));
		circle.draw(gc, Color.CHOCOLATE);
		
		rectangle.setDimensions(new ArrayList<Integer>(Arrays.asList(200,200,100,70)));
		rectangle.draw(gc, Color.BLACK);

	    shape2.setDimensions(new ArrayList<Integer>( Arrays.asList(90,190,10,30,170,170)));
	    System.out.println(shape2.getDimensions());
	    shape1.setDimensions(new ArrayList<Integer>( Arrays.asList(350,50,350,300)));
	    System.out.println(shape1.getDimensions());
		shape1.draw(gc, Color.BLACK);
	
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
