import java.awt.Graphics;

public class Line extends Shape_1 {
public Line() {
type="Line";
}
private java.awt.Color color;
private int x1;
private int y1;
private int x2;
private int y2;

// Should get the x input value somehow from the GUI
public void setX1(int InX1) {
	this.x1 = InX1;
}

public void setY1(int InY1) {
	this.y1 = InY1;
}

public void setX2(int InX2) {
	this.x2 = InX2;
}

public void setY2(int InY2) {
	this.y2 = InY2;
}

public int getX1() {
	return x1;
}

public int getY1() {
	return y1;
}
public int getX2() {
	return x2;
}

public int getY2() {
	return y2;
}

@Override
public void draw(Graphics g) {
	g.drawLine(getX1(), getY1(), getX2(), getY2());
	System.out.println("Inside Line::draw() method.");
}

@Override
public void setColor(java.awt.Color c) {
	this.color = c;
}

@Override
public java.awt.Color getColor() {
	return color;
}

}
