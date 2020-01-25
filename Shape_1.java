import java.awt.Graphics;

public abstract class Shape_1 implements Cloneable {
	
	protected String type;
	abstract void draw(Graphics g);
	abstract void setColor(Color c);
	abstract Color getColor();
	
	
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