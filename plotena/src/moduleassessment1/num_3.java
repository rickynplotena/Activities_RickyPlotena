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
public class num_3 {
    public static void main(String[] args) {
     float [] grades = {80,81,82,83,90};
        float sum =0;
        float ave =0;
        for(int i= 0; i < grades.length; i++) {
            sum += grades[i];
            
        }
        ave = sum/grades.length;
        System.out.println("The total average is: " + ave);
 
    }
}
