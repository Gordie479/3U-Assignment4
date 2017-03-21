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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner input = new Scanner(System.in);

        int pos = 1;

        while (pos < 100) {

            System.out.println("Your current position is " + pos + ". Enter the roll of the dice.");
            int roll = input.nextInt();
            
            if (roll < 2 || roll > 12) {
                System.out.println("Invalid number. Enter the roll of the dice.");
            }
            if (roll >= 2 && roll <= 12) {
                pos = roll + pos;

                if (pos == 54) {
                    pos = 19;
                    System.out.println("You hit a snake and have fallen down.");
                }
                if (pos == 90) {
                    pos = 48;
                    System.out.println("You hit a snake and have fallen down.");
                }
                if (pos == 99) {
                    pos = 77;
                    System.out.println("You hit a snake and have fallen down.");
                }
                if (pos == 9) {
                    pos = 34;
                    System.out.println("You hit a ladder and have climbed up.");
                }
                if (pos == 40) {
                    pos = 64;
                    System.out.println("You hit a ladder and have climbed up.");
                }
                if (pos == 67) {
                    pos = 86;
                    System.out.println("You hit a ladder and have climbed up.");
                }
                if (pos >= 100) {
                    System.out.println("Congratulations! You have won!");
                    break;
                }
            }
        }
    }
}