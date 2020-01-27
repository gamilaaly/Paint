package classes;


import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Circle extends Shape {
	public Circle() {
		//Checking purposes
		type="Circle";
		Original=true;
	}
	public boolean isOriginal() {
		return Original;	
	}

	private Color colour;
	private ArrayList<Double> Dimensions;

	public void setDimensions(ArrayList<Double> D) {
		this.Dimensions= (ArrayList<Double>) D.clone();
	}

	public ArrayList<Double> getDimensions() {
		return Dimensions;
	}



	@SuppressWarnings("exports")
	@Override
	public void draw(GraphicsContext g, Color c) {
		g.setFill(c);
		//g.fillOval(getX(), getY(), getHeight(), getWidth());
		g.fillOval(this.Dimensions.get(0),this.Dimensions.get(1),this.Dimensions.get(2),this.Dimensions.get(2));
	}


	@SuppressWarnings("exports")
	public void setColor(Color c) {
		this.colour = c;
		//checking
		System.out.println("Color has changed");
	}


	@SuppressWarnings("exports")
	public Color getColor() {
		return colour;
	}

	@Override
	public Boolean contains(double x, double y) {
		return null;
	}
	/*
   @Override
	public void accept(ModifyingVisitorImp visitor)  {
		visitor.visit(this,this.colour);
	}*/
}