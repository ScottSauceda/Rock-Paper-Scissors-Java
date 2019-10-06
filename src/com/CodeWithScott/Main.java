package com.CodeWithScott;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int generateRandomIntIntRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Rock, Paper, Scissors \n");

        String menuChoice = "";

        String gameModeChoice = "";

        String gameChoicePlayer1 = "";

        String gameChoicePlayer2 = "";

        int randomGameChoice;

        String computerChoice = "";

        do {

            System.out.println("Main Menu");
            System.out.println("======");

            Scanner input = new Scanner(System.in);

            System.out.println("1. Type 'play' to play.");
            System.out.println("2. Type 'history' to view your game history.");
            System.out.println("3. Type 'quit' to stop playing. \n");

            menuChoice = input.nextLine();

            System.out.println("You chose : " + menuChoice + "\n");


//            If to begin menu choice
            if(menuChoice.equalsIgnoreCase("play")){

                System.out.println("1. Type '2 players' to play against a human.");
                System.out.println("2. Type 'computer' to play against the computer.");

                gameModeChoice = input.nextLine();

//              If to begin game mode choice of 2 players or computer
                if(gameModeChoice.equalsIgnoreCase("2 players")){

                    System.out.println("Player 1 will go first.");
                    System.out.println("Type 'rock', 'paper', or 'scissors'.");

                    gameChoicePlayer1 = input.nextLine();

                    System.out.println("Player1 : " + gameChoicePlayer1 + "\n");

                    System.out.println("Player 2 will go now.");
                    System.out.println("Type 'rock', 'paper', or 'scissors'.");

                    gameChoicePlayer2 = input.nextLine();

                    System.out.println("Player2 chose : " + gameChoicePlayer1 + "\n");
//                    else if t
                } else if(gameModeChoice.equalsIgnoreCase("computer")){
                    randomGameChoice = generateRandomIntIntRange(1, 9);

                    if(randomGameChoice == 1 || randomGameChoice == 4 || randomGameChoice == 7){
                        computerChoice = "paper";
                        System.out.println("Computer chose : " + computerChoice + "\n");
                    } else if (randomGameChoice == 2 || randomGameChoice == 5 || randomGameChoice == 8){
                        computerChoice = "rock";
                        System.out.println("Computer chose : " + computerChoice + "\n");
                    } else if (randomGameChoice == 3 || randomGameChoice == 6 || randomGameChoice == 9){
                        computerChoice = "scissors";
                        System.out.println("Computer chose : " + computerChoice + "\n");
                    } else {
                        System.out.println("Ooops, something went wrong!");
                    }

                    System.out.println("Random Game Choice: " + randomGameChoice);


                    if(gameChoicePlayer1.equals("rock") && computerChoice.equals("scissors") || gameChoicePlayer1.equals("scissors") && computerChoice.equals("paper") || gameChoicePlayer1.equals("paper") && computerChoice.equals("rock")){
                        System.out.println("Player1 won! \n");
                    } else if(computerChoice.equals("rock") && gameChoicePlayer1.equals("scissors") || computerChoice.equals("scissors") && gameChoicePlayer1.equals("paper") || computerChoice.equals("paper") && gameChoicePlayer1.equals("rock")){
                        System.out.println("Computer won! \n");
                    } else {
                        System.out.println("It's a tie game! \n");
                    }
                }


            } else if(menuChoice.equalsIgnoreCase("history")) {
                System.out.println("Yes you have game history. \n");
            } else if(menuChoice.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye now");
            } else {
                System.out.println("Something went wrong, please try again.");
            }


        } while(!menuChoice.equals("quit"));

//        System.out.println("Computer picks: scissors");
//        System.out.println("User picks: rock");
//        System.out.println("You win! \n");
//
//
//        System.out.println("history");
//        System.out.println("Win: Player picked rock, computer picked scissors");
//        System.out.println("Loss: Player picked paper, computer picked scissors");
//
//        System.out.println("quit");

    }
}
