package paint;

import java.awt.Graphics;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
// Same exact functions as rectangle but with making height = width, make the GUI take take 1 parameter to be more realistic
public class Square extends Shape {
	public Square() {
	type="Square";	
	}
	private java.awt.Color color;
	private int x;
	private int y;
	private int height;
	private int width;

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
		g.fillRect(getX(), getY(), getHeight(), getWidth());
		System.out.println("Inside Square::draw() method");
	}

	@Override
	public void setColor(java.awt.Color c) {
		this.color =c;
	}

	@Override
	public java.awt.Color getColor() {
		return color;
	}
	@Override
	public void accept(ModifyingVisitorImp visitor)  {
		visitor.visit(this,this.color);
	}
}
