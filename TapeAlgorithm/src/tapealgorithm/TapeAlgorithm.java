/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapealgorithm;

/**
 *
 * @author MuhammadUmer
 */
public class TapeAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []array = {3,1,2,4,3};
        int diffference = getMinimalDifferenceON(array);
        System.err.println("Difference is "+diffference);
    }
    
    
    
    public static int getMinimalDifferenceON(int array[]){
        int difference = Integer.MAX_VALUE;
        int totalSumUpperPart = 0;
        int totalSumLowerPart = 0;
        
        for(int i=1; i< array.length;i++){
            totalSumLowerPart += array[i];
        }
        
        for(int i=1;i < array.length;i++){
            
            totalSumUpperPart += array[i-1];
            
            int tempDifference = totalSumLowerPart - totalSumUpperPart;
            
            totalSumLowerPart = totalSumLowerPart - array[i];
            
            if(tempDifference < 0){
                tempDifference = tempDifference * (-1);
            }
            if(tempDifference <  difference)
                difference = tempDifference;
        }
        return difference;
    }
    
    
    
    
    public static long getMinimalDifference(int array[]){
        int difference = Integer.MAX_VALUE;
        int totalSumUpperPart = 0;
        int totalSumLowerPart = 0;
        
        for(int i=1;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                totalSumLowerPart += array[j];
            }
            for(int k=0;k<i;k++){
                totalSumUpperPart += array[k];
            }
            int tempDifference = totalSumUpperPart - totalSumLowerPart;
            totalSumUpperPart = 0;totalSumLowerPart = 0;
            if(tempDifference < 0){
                tempDifference = tempDifference * (-1);
            }
            if(tempDifference <  difference)
                difference = tempDifference;
        }
        return difference;
    }
    
}
