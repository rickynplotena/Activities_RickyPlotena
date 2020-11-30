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
public class num_5 {
    public static void main(String[] args) {
          String given = "ricky plotena";
        String mask = "ricky";
        String output = null;
        StringBuffer buff = new StringBuffer (given);
        for(int i = 0; i < buff.length(); i++){
            for(int j =0; j< mask.length(); j++){
                if(buff.charAt(i)== mask.charAt(j)){
                buff.deleteCharAt(i);
            }
        }
    }
    output = buff.toString();
    System.out.println("the given string is " + given);
    System.out.println("the given mask string is " + mask);
    System.out.println("the new string is: " + output);
}
}

    
    

