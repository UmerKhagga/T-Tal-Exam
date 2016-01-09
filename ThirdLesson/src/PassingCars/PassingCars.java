/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassingCars;

/**
 *
 * @author MuhammadUmer
 */
public class PassingCars {
    public static void main(String[] args){
     //int[] A = {0, 1, 0, 1, 1};
     //int[] A = {1,0};
     int[] A = {0, 1, 0, 1, 0, 1};
     int solution = solutionTwo(A);
     System.out.println("The No pairs of passing cars is " + solution);
    }

    private static int solutionTwo(int[] A) {
        int zCount = 0;  // how many going east 
        int passing = 0; // total passing pairs
   
        for(int i = 0; i < A.length; i++){
            if(A[i] == 1){
                passing += zCount;
            }
            else 
                zCount++;
        }
        if(passing > 1e9 || passing < 0) 
            return -1;
        else 
            return passing;
    }
    
    private static int solutionOne(int[] A) {
        int numberPairPassingCars = 0;
        for(int i = 0; i < A.length; i++){
            i=0;
            if(A[i] == 0){
                for(int j=i;j<A.length;j++){
                    if(A[j] == 1)
                        numberPairPassingCars++;
                }
            }
        }
        return numberPairPassingCars;
    }
}
