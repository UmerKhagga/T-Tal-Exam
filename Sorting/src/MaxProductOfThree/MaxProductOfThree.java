/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaxProductOfThree;

/**
 *
 * @author MuhammadUmer
 */
import java.util.*;
public class MaxProductOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] A = {-4, -6, 3, 4, 5};//120
        //int[] A = {-3, 1, 2, -2, 5, 6};//60
        int[] A ={4, 5, 1, 0};//20
        //int[] A = {-5, 5, -5, 4};//125  
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = ConvertToArrayList(A,arrayList);
        
        //Collections.sort(arrayList);
        
        int solution  = SolutionOne(arrayList);
        System.out.println("The Solution is "+solution);
    }

    private static ArrayList<Integer> ConvertToArrayList(int[] A, ArrayList<Integer> arrayList) {
        for (int i = 0; i < A.length; i++) {
            arrayList.add(A[i]);
        }
        return arrayList;
    }

    private static int SolutionOne(ArrayList<Integer> arrayList) {
        int maxProduct = Integer.MIN_VALUE;
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) > max1){
                max3 = max2;
                max2 = max1;
                max1 = arrayList.get(i);
            }
            else if(arrayList.get(i) > max2){
                max3 = max2;
                max2 = arrayList.get(i);
            }
            else if(arrayList.get(i) < min1){
                min2 = min1;
                min1 = arrayList.get(i);
            }
            else if(arrayList.get(i) < min2){
                min2 = arrayList.get(i);
            }
        }
        
        int product1 = min1 * min2 * max1;
        int product2 = max1 * max2 * max3;
        
        if(product1 > product2)
            return product1;
        else
            return product2;
        
    }
}
