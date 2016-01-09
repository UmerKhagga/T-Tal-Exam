/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrogRiverOne;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author MuhammadUmer
 */
public class FrogRiverOne {
    public static void main(String[] args){
        int[] A = { 1};
        //int[] A = { 2,2,2,2,2};
        
        ArrayList<Integer> arrayList = ConvertToArrayList(A); 
        int solution = solution(1 ,arrayList);
        //solution = frog(5 ,A);
        System.out.println("Solution is "+solution);
    }
    
    public static ArrayList<Integer> ConvertToArrayList(int[] A){
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < A.length ; i++){
            arrayList.add(A[i]);
        }
        //If sorting
        //Collections.sort(arrayList);
        return arrayList;
    } 
    
    public static int solution(int X, ArrayList<Integer> arrayList) {
        if(arrayList.size() == 1){
            if(arrayList.get(0) == X)
                return 0;
            else
                return -1;
        }
        int minSteps = X;
        //Create a new ArrayList
        ArrayList<Integer> unfilledArray = 
                new ArrayList<>(Arrays.asList(new Integer[arrayList.size() + 1]));
        Collections.fill(unfilledArray, 0);
        
        for(int i = 0;i < arrayList.size(); i++){
            if(unfilledArray.get(arrayList.get(i)) == 0){
                unfilledArray.set(arrayList.get(i), 1);
                minSteps--;
            }
            if(minSteps == 0)
                return i;
        }
        return -1;
    }
    
    public static int frog(int X, int[] A) {
        int steps = X;
        boolean[] bitmap = new boolean[steps+1];
        for(int i = 0; i < A.length; i++){
            if(!bitmap[A[i]]){
                bitmap[A[i]] = true;
                steps--;
            }
            if(steps == 0) return i;
        }
        return -1;
    }
}
