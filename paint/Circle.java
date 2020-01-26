package paint;


import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Circle extends Shape {
	public Circle() {
		//Checking purposes
		type="Circle";
	}

	private int x;
	private int y;
	private int height;
	private int width;
	private Color colour;
	private ArrayList<Integer> Dimensions;

	    public void setDimensions(ArrayList<Integer> D) {
			this.Dimensions=D;
		}
	    
	    public ArrayList<Integer> getDimensions() {
	    	return Dimensions;
	    }

	// Should get the x input value somehow from the GUI
	public void setX(int InX) {
		this.x = InX;
	}

	public void setY(int InY) {
		this.y = InY;
	}

	public void setWidth(int InWidth) {
		this.width = InWidth;
	}

	public void setHeight(int InHeight) {
		this.height = InHeight;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@SuppressWarnings("exports")
	@Override
	public void draw(GraphicsContext g, Color c) {
		g.setFill(c);
		g.fillOval(getX(), getY(), getHeight(), getWidth());
		System.out.println("Inside Circle::draw() method.");
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
/*
   @Override
	public void accept(ModifyingVisitorImp visitor)  {
		visitor.visit(this,this.colour);
	}*/
}