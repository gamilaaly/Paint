import java.awt.Graphics;

public interface Shape {
	void draw(Graphics g);
	void setColor(Color c);
	Color getColor();
}