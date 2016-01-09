/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinAvgTwoSlices;

/**
 *
 * @author MuhammadUmer
 */
public class MinAvgTwoSlices {
    public static void main(String[] args){
        int[] A = {4,2,2,5,1,5,8};
        //int[] A = {-3, -5, -8, -4, -10};
        int solution = SolutionOne(A);
        System.out.println("The starting position of slice "+solution);
    }

    private static int SolutionOne(int[] A) {
        int solution = 0;
        double minAvg = (A[0] + A[1]) / 2.0;
        
        for(int i=0; i < A.length - 2; i++){
            if(((A[i] + A[i+1]) / 2.0) < minAvg){
                minAvg = ((A[i] + A[i+1]) / 2.0);
                solution = i;
            }
            if(((A[i] + A[i+1] + A[i+2]) / 3.0) < minAvg){
                minAvg = ((A[i] + A[i+1] + A[i+2]) / 3.0);
                solution = i;
            }   
        }
        if(( (A[A.length - 1] + A[A.length -2]) / 2.0) < minAvg)
            solution = A.length - 2;
        
        return solution;
    }
}
