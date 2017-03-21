/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author simmg9723
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name.");
        String name = input.nextLine();
        
        System.out.println("What was the first test out of?");
        double test1 = input.nextDouble();
        System.out.println("What mark did you get?");
        double result1 = input.nextDouble();
        
        System.out.println("What was the second test out of?");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get?");
        double result2 = input.nextDouble();
        
        System.out.println("What was the third test out of?");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get?");
        double result3 = input.nextDouble();
        
        System.out.println("What was the fourth test out of?");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get?");
        double result4 = input.nextDouble();
        
        System.out.println("What was the fifth test out of?");
        double test5 = input.nextDouble();
        System.out.println("What mark did you get?");
        double result5 = input.nextDouble();
        
        System.out.println("Test scores for " + name + ".");
        
        double percent1 = 100/test1*result1;
        System.out.println("Test 1: " + percent1 + "%");
        
        double percent2 = 100/test2*result2;
        System.out.println("Test 2: " + percent2 + "%");
        
        double percent3 = 100/test3*result3;
        System.out.println("Test 3: " + percent3 + "%");
        
        double percent4 = 100/test4*result4;
        System.out.println("Test 4: " + percent4 + "%");
        
        double percent5 = 100/test5*result5;
        System.out.println("Test 5: " + percent5 + "%");
        
        double mean = percent1 + percent2 + percent3 + percent4 + percent5;
        
        double average = mean/5;
        
        System.out.println("Average: " + average + "%");
        
    }
}
