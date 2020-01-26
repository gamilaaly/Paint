package paint;

import java.awt.Graphics;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape {
	public Circle() {
		//Checking purposes
		type="Circle";
	}

	private int x;
	private int y;
	private int height;
	private int width;
	private java.awt.Color colour;


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

	@Override
	public void draw(GraphicsContext g) {
		g.fillOval(getX(), getY(), getHeight(), getWidth());
		System.out.println("Inside Circle::draw() method.");
	}

	
	public void setColor(java.awt.Color c) {
		this.colour = c;
		//checking
		System.out.println("Color has changed");
	}


	public java.awt.Color getColor() {
		return colour;
	}

   @Override
	public void accept(ModifyingVisitorImp visitor)  {
		visitor.visit(this,this.colour);
	}
}