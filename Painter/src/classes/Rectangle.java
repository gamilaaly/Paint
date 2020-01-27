package classes;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    private Color color;

    private ArrayList<Double> Dimensions;

    public void setDimensions(ArrayList<Double> D) {
        this.Dimensions = D;
    }

    public ArrayList<Double> getDimensions() {
        return Dimensions;
    }


    public Rectangle() {
        type = "Rectangle";
        Original = true;
    }

    public boolean isOriginal() {
        return Original;
    }


    @SuppressWarnings("exports")
    @Override
    public void draw(GraphicsContext g, Color c) {
        g.setFill(c);
        //g.fillRect(getX(), getY(), getHeight(), getWidth());
        g.fillRect(this.Dimensions.get(0), this.Dimensions.get(1), this.Dimensions.get(2), this.Dimensions.get(3));

    }

    @SuppressWarnings("exports")
    @Override
    public void setColor(Color c) {
        this.color = c;
    }

    @SuppressWarnings("exports")
    @Override
    public Color getColor() {
        return this.color;
    }
}
	/*
	public void accept(ModifyingVisitorImp visitor)  {
		visitor.visit(this,this.color);
	}*/

