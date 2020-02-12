package controllers;


import javafx.scene.paint.Color;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
// Same exact functions as rectangle but with making height = width, make the GUI take take 1 parameter to be more realistic
public class Square extends Shape {
	public Square() {
		type="Square";	
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

		//g.fillRect(getX(), getY(), getHeight(), getWidth());
		g.fillRect(this.Dimensions.get(0),this.Dimensions.get(1) ,this.Dimensions.get(2), this.Dimensions.get(2));

	}



	@SuppressWarnings("exports")
	@Override
	public void setColor(Color c) {
		this.color =c;
	}

	@SuppressWarnings("exports")
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public Boolean contains(double x, double y)
	{
		return x > Dimensions.get(0) && (x - Dimensions.get(0)) < Dimensions.get(3) && y > Dimensions.get(1) && (y - Dimensions.get(1) < Dimensions.get(2));

	}

	/*
	@Override
	public void accept(ModifyingVisitorImp visitor)  {
		visitor.visit(this,this.color);
	}*/
}
