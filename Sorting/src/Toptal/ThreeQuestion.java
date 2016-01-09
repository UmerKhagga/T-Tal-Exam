/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toptal;

/**
 *
 * @author MuhammadUmer
 */
public class ThreeQuestion {
    public static void main(String[] args) {
        int[] A = {1,0,1,1,0,0,1,1,0,0,0,1,0};
        int[] B = {0,0,1,0,0,1,1,1,1,1,0,1};
        int[] solution  = SolutionOne(A, B);
        
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i]);
            
        }
    }

    private static int[] SolutionOne(int[] A, int[] B) {
        
        int[] solution = {1,0};
        System.out.println(decimal);
        
        
        //int number2 = Integer.parseInt(numberTwo,2);
        //int number3 = number1 + number2;
        
        //System.out.println(number1+"+"+number2+"="+number3);
        return solution; 
        
    }
}
