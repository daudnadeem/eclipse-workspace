package com.qa.FlyWeightPattern;

public class Square implements Shape {
	   private String color;
	   private int length;
	   private int width;

	   public Square(String color){
	      this.color = color;		
	   }

	   public void setX(int x) {
	      this.length = x;
	   }

	   public void setY(int y) {
	      this.width = y;
	   }


	   public void draw() {
	      System.out.println("Square: Draw() [Colour : " + color + ", Area : " + (length * width) + "]");
	   }
	}
