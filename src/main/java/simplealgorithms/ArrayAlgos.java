/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplealgorithms;

import java.util.Scanner;

/**
 *
 * @author Vihan De Silva
 */
public class ArrayAlgos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER VALUE FOR CHECKING STRING:");
        String input = sc.next();
        detectNumerics(input);
        
    }

    private static void reverseArray(Object[] array) {
        // Time complexity: O(n)
        // Other method: collections.reverse()
        for (int i = 0; i < array.length / 2; i++) {
            Object temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }
    
    private static void detectNumerics(String input){
        char[] arr = input.toCharArray();
        boolean hasNumeric = false;
        boolean hasAlpha = false;
        
        for(int i=0; i<arr.length;i++){
            try{
                int num = Integer.parseInt(String.valueOf(arr[i]));
                hasNumeric = true;
            }
            catch(Exception e){
                hasAlpha = true;
                continue;
            }
        }
        
        if(hasNumeric == true && hasAlpha == false){
            System.out.println("ALL INTEGERS");
        }
        
        else if(hasNumeric == true && hasAlpha == true){
            System.out.println("ALPHANUMERIC");
        }
        
        else{
            System.out.println("ALL CHARACTERS");
        }
        
    }
}
