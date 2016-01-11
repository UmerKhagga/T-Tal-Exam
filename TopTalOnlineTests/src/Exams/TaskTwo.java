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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TaskTwo {
    public static void main(String[] args) {
        // TODO code application logic here
        int Y = 2014;
        String A = "April";
        String B = "May";
        String W = "Wednesday";
        int solution = SolutionOne(Y, A, B, W);
        System.out.println("The solution to this problem is "+solution);
    }

    private static int SolutionOne(int Y, String A, String B, String W) {
        
        Map<String, Integer> weekMap = new HashMap<String, Integer>();
        weekMap.put("Monday", 1);
        weekMap.put("Tuesday", 2);
        weekMap.put("Wednesday", 3);
        weekMap.put("Thursday", 4);
        weekMap.put("Friday", 5);
        weekMap.put("Saturday", 6);
        weekMap.put("Sunday", 7);
        
        Map<Integer, Integer> x = new HashMap<Integer, Integer>();
        //x.put(1, 31 - weekMap.size() - (weekMap.get(W) - 1));
        x.put(1, 31);
        x.put(2, 28);
        x.put(3, 31);
        x.put(4, 30);
        x.put(5, 31);
        x.put(6, 30);
        x.put(7, 31);
        x.put(8, 31);
        x.put(9, 30);
        x.put(10, 31);
        x.put(11, 30);
        x.put(12, 31);
        

        
        if(Y % 4 == 0){
            x.put(2, 29);
        }
        
        Date date = new Date();
        try {
            date = new SimpleDateFormat("MMMM").parse(A);
        } catch (ParseException ex) {
            Logger.getLogger(TaskTwo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        int monthOne =cal.get(Calendar.MONTH);
        int monthOneNumberDays = 0;
        for (int i = 1; i <= monthOne; i++) {
            monthOneNumberDays += x.get(i);
        }
        String firstDay = getFirstDayOfMonth(monthOne,Y);
        int firstDayNumber =  7 - weekMap.get(firstDay);
        //monthOneNumberDays -= weekMap.get(W) + 2;
        monthOneNumberDays -= firstDayNumber;
        
        Date date1 = new Date();
        try {
            date1 = new SimpleDateFormat("MMMM").parse(B);
        } catch (ParseException ex) {
            Logger.getLogger(TaskTwo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        
        int monthTwo =cal1.get(Calendar.MONTH);
        int monthTwoNumberDays = 0;
        for (int i = 1; i <= monthTwo +1; i++) {
            monthTwoNumberDays += x.get(i);
        }
        
        //monthTwoNumberDays -= weekMap.get(W) + 2;
        
        int difference = monthTwoNumberDays - monthOneNumberDays;
        //difference -= weekMap.get(W) + 2;
        int weeks = difference / 7;

        return weeks;
        
    }
    
    private static String getFirstDayOfMonth(int month, int Y){
     Calendar cal = Calendar.getInstance();
     cal.set(Calendar.DATE, 1);
     cal.set(Calendar.MONTH, month);
     cal.set(Calendar.YEAR, Y);

     cal.set(Calendar.DAY_OF_MONTH, 1);
     Date firstDayOfMonth = cal.getTime();  

     DateFormat sdf = new SimpleDateFormat("EEEEEEEE");   
     return sdf.format(firstDayOfMonth); 
    }
}
