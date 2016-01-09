/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toptalonlinetests;

/**
 *
 * @author MuhammadUmer
 */
import java.util.*;

public class TopTalOnlineTestsFirstType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = {0,1};
        int solution = SolutionOne(A);
        System.out.println("The solution to this problem is "+solution);
    }
    
    private static int SolutionOne(int[] A) {
        int solution = 0;
        return solution;
    }
    
    private static void SolutionOne(int[] A, boolean isReturnArray){
        int[] solution = {0,1};
        if(isReturnArray){
            for (int i = 0; i < A.length; i++) {
                System.out.print(""+A[i]);
            }
        }
    }
    
    private static ArrayList<Integer> ConvertToArrayList(int[] array){
        ArrayList<Integer> arrayList =  new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
    
    private static ArrayList<Integer> ConvertToArrayList(int[] array, boolean doSort){
        ArrayList<Integer> arrayList =  new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        if(doSort){
            Collections.sort(arrayList);
        }
        return arrayList;
    }
    
}
