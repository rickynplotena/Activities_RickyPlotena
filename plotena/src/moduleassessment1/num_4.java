/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduleassessment1;

/**
 *
 * @author Acer
 */
public class num_4 {
    public static void main(String[] args) {
           String given = "ricky plotena";
        String contain = "na";
        String getLast = given.substring(given.length()-2, given.length());
        System.out.println("given string is: " +given);
         System.out.println("string containing " +contain+" at last " + (getLast.equals(contain)));
    }
    }
    

