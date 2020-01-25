import java.awt.Graphics;

public class Circle implements Shape {
	public Circle() {
	};

	private int x;
	private int y;
	private int height;
	private int width;
	private Color color;

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
	public void draw(Graphics g) {
		g.drawOval(getX(), getY(), getWidth(), getHeight());
		System.out.println("Inside Circle::draw() method.");
	}

	@Override
	public void setColor(Color c) {
		this.color = c;
	}

	@Override
	public Color getColor() {
		return color;
	}
}
