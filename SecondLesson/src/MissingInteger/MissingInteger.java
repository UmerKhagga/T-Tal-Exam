/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MissingInteger;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MuhammadUmer
 */
public class MissingInteger {
    public static void main(String[] args){
        //int[] A = {10};
        //int[] A = {1,3,6,4,1,2};
        //int[] A = {98,99,100,102,104,103};
        //int[] A = {-98,-99,-100,-97};
        int[] A = {4,5,6,2};
        
        ArrayList<Integer> arrayList = ConvertToArrayList(A); 
        arrayList = ConvertToDistinctArrayList(arrayList);
        Collections.sort(arrayList);
        int solution = solutionOne(arrayList);
        System.out.println("The Solution is "+ solution);
    }
    
    public static ArrayList<Integer> ConvertToArrayList(int[] A){
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < A.length ; i++){
            arrayList.add(A[i]);
        }
        return arrayList;
    }
    
    public static ArrayList<Integer> ConvertToDistinctArrayList(ArrayList<Integer> arrayList){
        Set<Integer> uniqueList = new HashSet<>(arrayList);
        uniqueList.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(uniqueList);
        return arrayList;
    }
    
    private static int solutionOne(ArrayList<Integer> arrayList) {
        int solution = 1;
        
        if(arrayList.get(0) > 0 && arrayList.get(0) != 2){
            solution = arrayList.get(0);
        }
        
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) > 0 ){
                if(solution == arrayList.get(i)){
                    solution++;
                }
                else
                    return solution;
            }
            else {
                solution++;
            }
        }
        return solution;
    }
}
