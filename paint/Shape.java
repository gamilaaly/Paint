package paint;

import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.scene.canvas.*;


public abstract class Shape implements Cloneable {
	protected String type;
	protected boolean Original;
	abstract boolean isOriginal();
	abstract void draw(GraphicsContext g, Color c);
	abstract void setColor(Color c);
	abstract Color getColor();
	//abstract void accept (ModifyingVisitorImp visitor);
	//DIMENSIONS
    abstract void setDimensions(ArrayList<Integer> Dimensions);
	abstract ArrayList<Integer> getDimensions();
	public String getType(){
	return type;
	}
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Shape c= (Shape)clone;
		c.Original=false;
		return clone;
	}

}