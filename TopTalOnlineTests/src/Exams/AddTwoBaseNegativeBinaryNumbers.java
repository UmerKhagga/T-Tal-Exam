/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exams;

/**
 *
 * @author MuhammadUmer
 */
public class AddTwoBaseNegativeBinaryNumbers {
    public static void main(String[] args){
        int[] A = {0,1,1,0,0,1,0,1,1,1,0,1,0,1,1};
        int[] B = {0,0,1,0,0,1,1,1,1,1,0,1};
        SolutionOne(A,B,true);
        //System.out.println("The solution to this problem is "+solution);
    }
    
    private static void SolutionOne(int[] A, int[] B, boolean isReturnArray) {
        int number1=0;
        for (int i = 0; i < A.length; i++) {
            number1 += (A[i] * Math.pow(-2, i));
        }
        
        //For Number Two calculation
        
        int number2 = 0;
        for (int i = 0; i < B.length; i++) {
            number2 += (B[i] * Math.pow(-2, i));
        }
        
        int number3 = number1 + number2;
        
        String numberThree = "";
        while(number3 !=0){
            int remainder = number3 % -2;
            number3 = number3 / -2;
            
            if(remainder < 0){
                remainder +=2;
                number3 +=1;
            }
            
            numberThree += "" + remainder;
        }
        
        String[] solutionArray = numberThree.split("");
        
        if(isReturnArray){
            for (int i = 0; i < solutionArray.length; i++) {
                System.out.print(""+solutionArray[i]);
            }
        }
    }
}
