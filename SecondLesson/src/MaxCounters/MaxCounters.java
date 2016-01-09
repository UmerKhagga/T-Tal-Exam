/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaxCounters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author MuhammadUmer
 */
public class MaxCounters {
    public static void main(String[] args){
        int[] A = {3,4,4,6,1,4,4};
        int N = 5;
        //ArrayList<Integer> arrayList = ConvertToArrayList(A);
        
        //int[] solution = SolutionOne(N, arrayList);
        
        int[] solution = copiedSolution(N, A);
        
        for(int i = 0; i < solution.length; i++){
            System.out.print(solution[i] + ",");
        }
    }

    public static ArrayList<Integer> ConvertToArrayList(int[] A){
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < A.length ; i++){
            arrayList.add(A[i]);
        }
        return arrayList;
    }

    private static int[] SolutionOne(int N, ArrayList<Integer> arrayList) {
        int[] solution  = new int[N];
        int currentMaxCounter = 0;
        int lastMaxCounter = 0;
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) > N){
                lastMaxCounter = currentMaxCounter;
                solution = new int[N];
            }
            else {
                solution[arrayList.get(i) -1]++;
                if(solution[arrayList.get(i) -1] + lastMaxCounter > currentMaxCounter)
                    currentMaxCounter = solution[arrayList.get(i) -1] + lastMaxCounter;          
            }
        }
        
        for(int i=0; i<solution.length; i++){
                solution[i] += lastMaxCounter;
        }
        return solution;
    }

    private static int[] ArrayListToPrimitiveIntArray(ArrayList<Integer> solution) {
        int[] solutionArray = new int[solution.size()];
        for(int i = 0;i<solution.size();i++){
            solutionArray[i] = solution.get(i);
        }
        return solutionArray;
    }
    
    private static int[] copiedSolution(int N, int[] A){
        int counter[] = new int[N];
        int n = A.length;
        int max=-1,current_min=0;

        for(int i=0;i<n;i++){
            if(A[i]>=1 && A[i]<= N) {
                
                if(counter[A[i] - 1] < current_min) 
                    counter[A[i] - 1] = current_min;
                counter[A[i] - 1] = counter[A[i] - 1] + 1;
                
                if(counter[A[i] - 1] > max) 
                    max = counter[A[i] - 1];
            }
            else if(A[i] == N+1){
                current_min = max;
            }
        }
        
        for(int i=0;i<N;i++){
            if(counter[i] < current_min) counter[i] =  current_min;
        }
        return counter;
    }
    
}
