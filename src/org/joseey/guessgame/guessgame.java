package org.joseey.guessgame;

import java.util.Random;
import java.util.Scanner;

public class guessgame {

    public static void main(String[] args) {
        //CHALLENGE BELOW

        System.out.println("Welcome to my Guessing Game\n");
        System.out.println("what's your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name + "\n");
        System.out.println("Will you like to play a game");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
        int startgame = scanner.nextInt();

        while(startgame != 1){
            System.out.println("Will you like to play a game");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            startgame = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("Please guess a number: ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish){
            timesTried++;

            if(timesTried < 5){
                if(userInput == x){
                    hasWon = true;
                    shouldFinish = true;

                }else if(userInput > x){
                    System.out.println("Guess A lower number next time");
                    userInput = scanner.nextInt();
                }else{
                    System.out.println("Guess A higher Number Next time");
                    userInput = scanner.nextInt();
                }
            }else{
                shouldFinish = true;
            }
        }
        if(hasWon){
            System.out.println("Congratulations you have won the game under " + timesTried + " trial.");
        }else{
            System.out.println("Game Over !!!");
            System.out.println("The Number eventually was: " + x);
        }
    }


}
