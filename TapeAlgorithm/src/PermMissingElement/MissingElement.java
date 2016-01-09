/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PermMissingElement;

/**
 *
 * @author MuhammadUmer
 */
public class MissingElement {
    public static void main(String[] args) {
        int []array = {2,3,1,5};
        long element = getMissingElementByFormula(array);
        System.err.println("Missing Element is "+element);
    }

    private static int getMissingElement(int[] array) {
        int missingElement = 0;
        int lowestElement = array[0];
        for(int i=1;i<=array.length;i++){
            if(array[i] < lowestElement)
                lowestElement = array[i]; 
        }
        for(int i=1;i<array.length;i++) {
            
        }
        return missingElement;
    }
    
    
    private static long getMissingElementByFormula(int []A) {
        
        int N   = A.length;
        long sum = (N + 2) * (N + 1) / 2;
        for(int i = 0; i < N; i++){
            sum -= A[i];
        }
        return sum;
    }
  
}
