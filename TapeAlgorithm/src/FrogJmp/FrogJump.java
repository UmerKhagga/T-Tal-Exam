/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrogJmp;

/**
 *
 * @author MuhammadUmer
 */
public class FrogJump {
    public static void main(String[] args) {
        // TODO code application logic here
        int start = 10;
        int end = 85;
        int jumpDistance = 30;
        long numberJumps = getMinimumJumps(start,end,jumpDistance);
        System.err.println("Minimum Number of jumps are "+numberJumps);
    }

    private static long getMinimumJumps(int start, int end, int jumpDistance) {
        long numberJumps = 0;
        
        int quotient = (end - start) / jumpDistance;
        numberJumps = quotient;
        int remainder = (end - start) % jumpDistance;
        if(remainder > 0){
            numberJumps++;
        }
        return numberJumps;
    }
    
}
