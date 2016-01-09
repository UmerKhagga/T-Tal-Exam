/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PermCheck;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MuhammadUmer
 */
public class PermCheck {
    public static void main(String[] args){
        int[] A = {4,1,3};
        ArrayList<Integer> arrayList = ConvertToArrayList(A); 
        int solution = solutionOne(arrayList);
        System.out.println("Solution is "+solution);
    }
    
    public static ArrayList<Integer> ConvertToArrayList(int[] A){
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < A.length ; i++){
            arrayList.add(A[i]);
        }
        //If sorting
        Collections.sort(arrayList);
        return arrayList;
    } 

    private static int solutionOne(ArrayList<Integer> arrayList) {
        int solution = 0;
        int maxNumber = Collections.max(arrayList);
        int correctPermutationValue = maxNumber * (maxNumber + 1) / 2;
        
        int doubtPermutationValue = 0;
        int counter = 1;
        for(int i = 0; i < arrayList.size(); i++) {
            if(counter == arrayList.get(i))
                doubtPermutationValue += arrayList.get(i);
            else
                return 0;
            counter++;
        }
        if(correctPermutationValue == doubtPermutationValue)
            solution = 1;
        return solution;
    }
}
