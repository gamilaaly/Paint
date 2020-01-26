package paint;

import javafx.scene.paint.Color;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
// Same exact functions as rectangle but with making height = width, make the GUI take take 1 parameter to be more realistic
public class Square extends Shape {
	public Square() {
	type="Square";	
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
		
		//g.fillRect(getX(), getY(), getHeight(), getWidth());
		g.fillRect(Dimensions.get(0),Dimensions.get(1) , Dimensions.get(2), Dimensions.get(3));

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
