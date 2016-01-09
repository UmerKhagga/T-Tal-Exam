/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenomicRangeQuery;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author MuhammadUmer
 */
public class GenomicRangeQuery {
    public static void main(String[] args){
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int M = P.length;
        
        int[] solution = SolutionOne(S, P, Q, M);
        for(int i=0;i<solution.length;i++){
            System.out.println(solution[i] + ",");
        }
    }

    private static int[] SolutionOne(String S, int[] P, int[] Q, int M) {
        int[] solutionList = new int[M];
        
        String[] splittedString  = ConvertStringToStringArray(S);
        
        for(int i = 0;i < M; i++){
            int minImpactCounter = Integer.MAX_VALUE;
            int pValue = P[i];
            int qVaue = Q[i];
            for(int j=pValue; j<= qVaue; j++){
                if(splittedString[j].equals("A")){
                    if(minImpactCounter > 1){
                        minImpactCounter = 1;
                        solutionList[i] = minImpactCounter;
                    }
                }
                if(splittedString[j].equals("C")){
                    if(minImpactCounter > 2){
                        minImpactCounter = 2;
                        solutionList[i] = minImpactCounter;
                    }
                }
                if(splittedString[j].equals("G")){
                    if(minImpactCounter > 3){
                        minImpactCounter = 3;
                        solutionList[i] = minImpactCounter;
                    }
                }
                if(splittedString[j].equals("T")){
                    if(minImpactCounter > 4){
                        minImpactCounter = 4;
                        solutionList[i] = minImpactCounter;
                    }
                }
            }   
        }
        return solutionList;
    }
    
    public static String[] ConvertStringToStringArray(String S){
        String[] splittedString = S.split("");
        String[] cleanArray = new String[S.length()];
        int counter = 0;
        for(int i=0; i<splittedString.length;i++){
            if(!splittedString[i].equals("")){
                cleanArray[counter] = splittedString[i];
                counter++;
            }
        }
        return cleanArray;
    }
    
    public static int[] ArrayListToArray(ArrayList<Integer> arrayList){
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    } 
}
