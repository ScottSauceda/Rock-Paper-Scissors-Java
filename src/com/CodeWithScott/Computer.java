package com.CodeWithScott;

import java.util.Random;

public class Computer {

    private String computerChoice;

    public static int generateRandomIntIntRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String generateRandomChoice(int num){
        //                    if to set computers choice based on randomInteger

        if(num == 1 || num == 4 || num == 7){
            this.computerChoice = "paper";
            System.out.println("Computer chose : " + this.computerChoice + "\n");
        } else if (num == 2 || num == 5 || num == 8){
            this.computerChoice = "rock";
            System.out.println("Computer chose : " + this.computerChoice + "\n");
        } else if (num == 3 || num == 6 || num == 9){
            this.computerChoice = "scissors";
            System.out.println("Computer chose : " + this.computerChoice + "\n");
        } else {
            System.out.println("Oops, something went wrong!");
        }

        return computerChoice;
    }

}
