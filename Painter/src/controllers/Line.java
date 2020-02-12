package controllers;


import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape {
	public Line() {
		type="Line";
		Original=true;
	}
	public boolean isOriginal() {
		return Original;	
	}
	private Color color;

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
		//g.strokeLine(getX1(), getY1(), getX2(), getY2());
		g.strokeLine(this.Dimensions.get(0), this.Dimensions.get(1), this.Dimensions.get(2), this.Dimensions.get(3));

	}

	@SuppressWarnings("exports")
	@Override
	public void setColor(Color c) {
		this.color = c;
		System.out.println("color has changed");
	}

	@SuppressWarnings("exports")
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public Boolean contains(double x, double y)
	{
		return null;

	}


}