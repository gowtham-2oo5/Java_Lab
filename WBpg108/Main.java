package ualala;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Triangle t=new Triangle();
		System.out.println("Default triangle is formed..."+t.toString());
		Scanner sc=new Scanner(System.in);
		System.out.println("________________");
		System.out.println("Enter dimensions of Triangle(side 1 ,side 2,side 3):");
		double s1=sc.nextDouble(),s2=sc.nextDouble(),s3=sc.nextDouble();
		System.out.println("Enter color of triangle: ");
		String color=sc.next();
		System.out.println("Do you want it to be filled ?(True/False)");
		boolean filled=sc.nextBoolean();
		sc.close();
		Triangle t1=new Triangle(s1,s2,s3,color,filled);
		System.out.println(t1.toString());
	}
}
