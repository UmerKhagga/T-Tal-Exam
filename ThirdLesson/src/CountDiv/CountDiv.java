/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountDiv;

/**
 *
 * @author MuhammadUmer
 */


  // Test cases
  //  [1,1,1] = 1
  // [0,99,2] = 50
  // [0, 100, 3] = 34  
  // [11,345,17] = 20
  // [10,10,5] = 1
  // [3, 6, 2] = 2
  // [6,11,2] = 3  
  // [16,29,7] = 2
  // [1,2,1] = 2

public class CountDiv {
    public static void main(String[] args){
        int A = 11;
        int B = 345;
        int K = 17;
        int solution = SolutionTwo(A,B,K);
        System.out.println("The Solution is "+ solution);
    }

    private static int SolutionTwo(int A, int B, int K) {
        int solution = 0;
        if ( A % K == 0) 
            ++solution;

        solution = (B/K) - (A /K) + solution;
        return solution;
    }
    
    //50 Percent Solution
    private static int SolutionOne(int A, int B, int K) {
        int solution = 0;
        for(int i = A; i <= B; i++) {
            if(i % K == 0 || i == 0)
                solution++;
        }
        return solution;
    }
}
