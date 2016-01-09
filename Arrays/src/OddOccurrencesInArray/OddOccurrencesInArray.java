/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OddOccurrencesInArray;

import java.util.*;

/**
 *
 * @author MuhammadUmer
 */
public class OddOccurrencesInArray {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = {42,56,42,56,78};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            arrayList.add(A[i]);
        }
        
        Collections.sort(arrayList);
        
        boolean counter = true;
        int value = arrayList.get(0);
        for (int i = 0; i < arrayList.size() - 2; i=i+2) {
            if(value != arrayList.get(i+1)){
                break;
            }
            else{
                value = arrayList.get(i + 2);
            }
        }
        System.out.println("The solution is "+ value);
    }
}
