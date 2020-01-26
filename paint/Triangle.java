package paint;


import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Triangle extends Shape {

	// Same exact functions as rectangle but with making height = width, make the GUI take take 1 parameter to be more realistic
	public Triangle() {
		type="Square";	
	}

	private Color color;
	private int x1;
	private int x2;
	private int x3;
	private int y1;
	private int y2;
	private int y3;
    private ArrayList<Integer> Dimensions;

    public void setDimensions(ArrayList<Integer> D) {
		this.Dimensions=D;
	}
    
    public ArrayList<Integer> getDimensions() {
    	return Dimensions;
    }
	
	public void setX1(int X1)
	{
		this.x1 =X1;

	}
	public void setX2(int X2)
	{
		this.x2 =X2;

	}
	public void setX3(int X3)
	{
		this.x3 =X3;

	}
	public void setY1(int Y1)
	{
		this.y1 =Y1;

	}public void setY2(int Y2)
	{
		this.y2 =Y2;

	}public void setY3(int X3)
	{
		this.x3 =X3;

	}

	public int getX1()
	{return x1;}
	public int getX2()
	{return x2;}
	public int getX3()
	{return x3;}
	public int getY1()
	{return y1;}
	public int getY2()
	{return y2;}
	public int getY3()
	{return y3;}

	@Override
	void draw(GraphicsContext g, Color c) {
		//g.fillPolygon(new double[]{getX1(), getX2(),getX3()},
		//       new double[]{ getY1(), getY2(), getY3()}, 3);
		g.setFill(c);
		g.fillPolygon(new double[]{90, 190 ,10},
				new double[]{ 30,170,170}, 3);
	}

	/*
		@Override
		void accept(ModifyingVisitorImp visitor) {
			visitor.visit(this,this.color);

		}
	 */	
	@SuppressWarnings("exports")
	public void setColor(Color c) {
		this.color = c;
		//checking
		System.out.println("Color has changed");
	}


	@SuppressWarnings("exports")
	public Color getColor() {
		return color;
	}

	
}
