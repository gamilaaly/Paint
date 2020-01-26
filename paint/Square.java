package paint;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;
// Same exact functions as rectangle but with making height = width, make the GUI take take 1 parameter to be more realistic
public class Square extends Shape {
	public Square() {
	type="Square";	
	}
	private Color color;
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

	@SuppressWarnings("exports")
	@Override
	public void draw(GraphicsContext g, Color c) {
		g.setFill(c);
		g.fillRect(getX(), getY(), getHeight(), getWidth());
		System.out.println("Inside Square::draw() method");
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
	
	/*
	@Override
	public void accept(ModifyingVisitorImp visitor)  {
		visitor.visit(this,this.color);
	}*/
}
