/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countingnumbersforloop;

import java.util.Scanner;

public class CountingNumbersForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        System.out.println("Please enter your choice\n" + 
            "1... Count from 0 to 10 by 1\n" +
            "2... Count from 100 to 0 by 10\n" +
            "3... Count from 50 to 500 by 50\n" +
            "4... Count from 6000 to 1000 by 1000");
        int number = input.nextInt();
        /*i++ same as i= i+1 | i+=10 same as i=i+10
        */
        
        if (number == 1){
            System.out.println("You have chosen to count from 0 to 10 by 1.");
            for (int i=0; i<=10; i++){ 
                System.out.println(i);
            }
        }
        if (number ==2){
            System.out.println("You have chosen to count from 100 to 0 by 10");
            for (int i=100;i>=0;i-=10)
                System.out.println(i);
        }
        if (number ==3){
            System.out.println("You have chosen to count from 50 to 500 by 50");
            for (int i=50;i<=500;i+=50)
                System.out.println(i);
        }
        if (number ==4){
            System.out.println("You have chosen to count from 6000 to 1000 by 1000");
            for (int i=6000;i>=1000;i-=1000)
                System.out.println(i);
        } else {
            System.out.println("Invalid input");
        }
    }
    
}
