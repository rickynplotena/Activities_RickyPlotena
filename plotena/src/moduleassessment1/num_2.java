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
public class num_2 {
    public static void main(String[] args) {
          String [][] stringarray = new String[10][10];
        
        for( int i = 0; i<stringarray.length; i++)
        {
         for(int a = 0; a<stringarray[i].length; a++){
                
            stringarray[i][a] = " @";
            }
         
        }
        for(int i = 0; i<stringarray.length; i++) {
            
            for(int a = 0; a<stringarray[i].length; a++){
                
                System.out.print(stringarray[i][a]);
            }
         System.out.print("\n");
        }
        
    }
    
}
