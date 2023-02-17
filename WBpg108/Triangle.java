package ualala;

public class Triangle extends GeometricShape {
	
	double s1,s2,s3;
	Triangle(){
		s1=s2=s3=1;
	}
	Triangle(double s1,double s2,double s3,String color,boolean filled){
		super(color,filled);
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	String getArea() {
		return "Area: "+(0.5*s2*s3);
	}
	String getPerimeter() {
		return "Perimeter: "+(s1+s2+s3);
	}
	public String toString() {
		System.out.println(super.toString());
		return "Triangle: \n"+"Side 1: "+s1+"\n"+"Side 2: "+s2+"\n"+"Side 3: "+s3+"\n"+getArea()+"\n"+ getPerimeter();
	}
}
