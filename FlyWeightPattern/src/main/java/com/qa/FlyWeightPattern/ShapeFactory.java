package com.qa.FlyWeightPattern;

import java.util.HashMap;

public class ShapeFactory {

   private static final HashMap circleMap = new HashMap();

   public static Shape getCircle(String color) {
      Square sqr = (Square)circleMap.get(color);

      if(sqr == null) {
    	  sqr = new Square(color);
         circleMap.put(color, sqr);
         System.out.println("Creating square of colour : " + color);
      }
      return sqr;
   }
}
