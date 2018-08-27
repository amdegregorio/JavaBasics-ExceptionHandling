/**
 * 
 */
package com.amydegregorio.javabasics.exceptionhandling;

/**
 * @author AMD
 *
 */
public class RuntimeExceptionExample {

   /**
    * @param args
    */
   public static void main(String[] args) {
      //Divide by 0
      int dividend = 14;
      int divisor = 0;
      
      try {
         int quotient = dividend / divisor;
      } catch (ArithmeticException ae) {
         System.err.println("Arithmetic Exception: " + ae.getMessage());
      }

   }

}
