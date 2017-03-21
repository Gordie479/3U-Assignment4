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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much does the food cost?");
        double food = input.nextInt();
        
        System.out.println("How much does the DJ cost?");
        double dj = input.nextInt();
        
        System.out.println("How much does it cost to rent the hall?");
        double hall = input.nextInt();
        
        System.out.println("How much do the decorations cost?");
        double decor = input.nextInt();
        
        System.out.println("How much does it cost to staff?");
        double staff = input.nextInt();
        
        System.out.println("How much for miscellaneous costs?");
        double misc = input.nextDouble();
        
        double total = food+dj+hall+decor+staff+misc;
        
        double tickets = (double)Math.ceil(total/35);
        
        System.out.println("The total cost is " + total + ". You will need to sell " + tickets + " tickets to break even.");
        
    }
}
