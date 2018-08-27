/**
 * 
 */
package com.amydegregorio.javabasics.exceptionhandling;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author AMD
 *
 */
public class TryCatchExample {

   /**
    * @param args
    */
   public static void main(String[] args) {
      String priceOfSmallCoffee = "2.566"; // For a valid amount change to $2.56
      Number amount = 0;
      try {
         amount = NumberFormat.getCurrencyInstance().parse(priceOfSmallCoffee);
      } catch (ParseException e) {
         System.err.println("Invalid Input '" + priceOfSmallCoffee + "'");
         System.err.println("Please provide valid currency input '$#.##");
      }
      
      System.out.println("Parsed Amount: " + amount.toString());
   }

}
