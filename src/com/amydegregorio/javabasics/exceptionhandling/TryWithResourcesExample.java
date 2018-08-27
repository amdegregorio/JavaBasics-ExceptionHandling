/**
 * 
 */
package com.amydegregorio.javabasics.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author AMD
 *
 */
public class TryWithResourcesExample {

   /**
    * @param args
    * @throws IOException 
    */
   public static void main(String[] args) {
      int cupsOfCoffee = 4;
      float pricePerCup = 2.46f;
      String outputFileName = "output.txt";
      
      try (FileWriter fw = new FileWriter(outputFileName)) {
         fw.write("Cups " + cupsOfCoffee + " at $" + pricePerCup + "ea. = $" + cupsOfCoffee * pricePerCup);
      } catch (IOException e) {
         System.err.println("An error occurred while writing the output.");
         System.err.println(e.getMessage());
      }
   }

}
