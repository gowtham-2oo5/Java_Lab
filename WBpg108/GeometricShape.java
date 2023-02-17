package ualala;

public class GeometricShape {
	
	String color;
	boolean filled;
	GeometricShape(){
		color=null;
		filled=false;
	}
	GeometricShape(String color,boolean filled)
	{
		setColor(color);
		setFilled(filled);
	}
	void setColor(String color) {
		this.color=color;
	}
	void setFilled(boolean filled) {
		this.filled=filled;
	}
	String getColor() {
		return "Color: "+color;
	}
	String getFilled() {
		if(filled==true)
			return color+" is filled.";
		else
			return color+" not filled.";
	}
	public String toString() {
		return getColor()+"\n"+getFilled();
	}
}
