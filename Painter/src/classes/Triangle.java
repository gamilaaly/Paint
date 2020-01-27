package classes;


import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Triangle extends Shape {

	// Same exact functions as rectangle but with making height = width, make the GUI take take 1 parameter to be more realistic
	public Triangle() {
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


	@Override
	public void draw(GraphicsContext g, Color c) {
		//g.fillPolygon(new double[]{getX1(), getX2(),getX3()},
		//       new double[]{ getY1(), getY2(), getY3()}, 3);
		g.setFill(c);
		//g.fillPolygon(new double[]{90, 190 ,10},
		//	new double[]{ 30,170,170}, 3);
		g.fillPolygon(new double[]{this.Dimensions.get(0), this.Dimensions.get(1),this.Dimensions.get(2)},
				new double[]{ this.Dimensions.get(3), this.Dimensions.get(4), this.Dimensions.get(5)}, 3);
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

	@Override
	public Boolean contains(double x, double y) {
		return null;
	}


}
