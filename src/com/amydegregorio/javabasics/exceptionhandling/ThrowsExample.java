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
public class ThrowsExample {

   /**
    * @param args
    */
   public static void main(String[] args) {
      try {
         Number amount = getAmount();
      } catch (ParseException e) {
         System.err.println("Unable to parse input: " + e.getMessage());
         System.err.println("Please provide valid currency input '$#.##");
      }

   }
   
   public static Number getAmount() throws ParseException {
      String priceOfSmallCoffee = "2.566"; // For a valid amount change to $2.56
      Number amount = 0;
      amount = NumberFormat.getCurrencyInstance().parse(priceOfSmallCoffee);
      return amount;
   }

}
