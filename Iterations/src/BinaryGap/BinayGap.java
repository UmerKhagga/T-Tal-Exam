/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryGap;

import java.util.Arrays;

/**
 *
 * @author MuhammadUmer
 */
public class BinayGap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 5;
        //String solution  = Integer.toBinaryString(N); 
        int solution = SolutionOne(N);
        System.out.print("The Solution is "+solution);
    }

    private static int SolutionOne(int N) {
        String sourceString = Integer.toBinaryString(N);
        String[] sourceStringArray = sourceString.split("");
        sourceStringArray = Arrays.copyOfRange(sourceStringArray, 1, sourceStringArray.length);
        
        boolean counterOne = false;
        int counter = 0;
        int bigCounter = 0;
        
        for(int i=0; i<sourceStringArray.length; i++){
            if(counterOne == true && sourceStringArray[i].equals("0")){
                counter++;    
            }
            if(sourceStringArray[i].equals("1") && counterOne == true){
                if(counter > bigCounter)
                    bigCounter = counter;
                counterOne = false;
                counter = 0;
            }
            
            if(sourceStringArray[i].equals("1")){
                counterOne = true;
            }
        }
        return bigCounter;
    }
    
}
