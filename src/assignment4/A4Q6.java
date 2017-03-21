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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit.");
        int limit = input.nextInt();

        System.out.println("Enter the recorded speed of the car.");
        int speed = input.nextInt();

        if (speed <= limit) {
            System.out.println("You are within the speed limit.");
        } else if (speed - limit <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (speed - limit > 30) {
            System.out.println("You are speeding and your fine is $500.");
        } else {
            System.out.println("You are speeding and your fine is $270.");
        }
    }
}
