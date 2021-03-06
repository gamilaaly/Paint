package paint;

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

	private ArrayList<Integer> Dimensions;

	public void setDimensions(ArrayList<Integer> D) {
		this.Dimensions=D;
	}

	public ArrayList<Integer> getDimensions() {
		return Dimensions;
	}

	@SuppressWarnings("exports")
	@Override
	public void draw(GraphicsContext g, Color c) {
		g.setFill(c);
		//g.strokeLine(getX1(), getY1(), getX2(), getY2());
		g.strokeLine(this.Dimensions.get(0), this.Dimensions.get(1), this.Dimensions.get(2), this.Dimensions.get(3));

		System.out.println("Inside Line::draw() method.");
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
	/*
	public void accept(ModifyingVisitorImp visitor)  {
		visitor.visit(this,this.color);
	}*/
}