package paint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UI extends Application {
	public static void main(String[] args) {
		Application.launch(args);
		// Shape shape1 = ShapeFactory.getShape("Rectangle");

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
		
		shape2.draw(gc);
		shape1.draw(gc);

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
