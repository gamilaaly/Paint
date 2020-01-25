import java.awt.Graphics;

import javafx.scene.canvas.*;
import javafx.scene.canvas.*;

public abstract class Shape_1 implements Cloneable {
	protected String type;
	abstract void draw(GraphicsContext g);
	abstract void setColor(java.awt.Color c);
	abstract java.awt.Color getColor();
	abstract void accept (ModifyingVisitorImp visitor);
	
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
		return clone;
	}

}