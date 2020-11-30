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
public class num_1 {
    public static void main(String[] args) {
  int[] array_1 = new int[5];
  int[] array_2 = new int[5];
        
        array_1[0] = 1; 
        array_1[1] = 3;
        array_1[2] = 5;
        array_1[3] = 7;
        array_1[4] = 9;
        
        array_2[0] = 50;
        array_2[1] = 51;
        array_2[2] = 72;
        array_2[3] = 32;
        array_2[4] = 82;
        
         arraycopy(array_1, 3, array_2, 0, 2);
    for (int i = 0; i   < array_2.length; i++)
    {
     System.out.println("Array "+ i +" " + array_2 [i]);
            
    }    
                
    }
    
     public static void arraycopy(int[] from, int fromstart, int[] to, int tostart, int count){
         
         for (int i = 0; i < count; i++) {
             to[tostart + i] = from[fromstart + i];
         }
     }
}
    

