/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guess.num;

import java.util.Scanner;

/**
 *
 * @author nilei4218
 */
public class GuessNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        int randNum,num;
        
        System.out.println("wellcome to a guessing game\n --------------------------");
        
        do{
        //ask player to guess a number
        System.out.println("\n Guess a number between 1 ~ 5");
        num = keyedInput.nextInt();
        
        //Generating random number between 1 ~ 5
        randNum = (int)Math.round(Math.random()*4 + 1);
        System.out.println(randNum);
        
        if (num == randNum)
            System.out.println("Good job you guessed it right!!! Owo");
        else
            System.out.println("oh!!! soo close, please try again");
        
        }
        while(num != randNum);
    }
    
}
