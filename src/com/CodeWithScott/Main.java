package com.CodeWithScott;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int generateRandomIntIntRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String generateRandomChoice(int num){
        //                    if to set computers choice based on randomInteger

        String computerChoice = "";

        if(num == 1 || num == 4 || num == 7){
            computerChoice = "paper";
            System.out.println("Computer chose : " + computerChoice + "\n");
        } else if (num == 2 || num == 5 || num == 8){
            computerChoice = "rock";
            System.out.println("Computer chose : " + computerChoice + "\n");
        } else if (num == 3 || num == 6 || num == 9){
            computerChoice = "scissors";
            System.out.println("Computer chose : " + computerChoice + "\n");
        } else {
            System.out.println("Oops, something went wrong!");
        }

        return computerChoice;
    }

    public static void checkWinnerOfGame(String player1Choice, String opponentChoice){
//        if else logic to check who won the game
        if(player1Choice.equals("rock") && opponentChoice.equals("scissors") || player1Choice.equals("scissors") && opponentChoice.equals("paper") || player1Choice.equals("paper") && opponentChoice.equals("rock")){
            System.out.println("Player1 won! \n");
        } else if(opponentChoice.equals("rock") && player1Choice.equals("scissors") || opponentChoice.equals("scissors") && player1Choice.equals("paper") || opponentChoice.equals("paper") && player1Choice.equals("rock")){
            System.out.println("Player 1 Lost! \n");
        } else {
            System.out.println("It's a tie game! \n");
        }

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Rock, Paper, Scissors \n");

        String menuChoice = "";

        String gameModeChoice = "";

        String gameChoicePlayer1 = "";

        String gameChoicePlayer2 = "";

        int randomInt;

        String computerChoice = "";

        String finalOpponentchoice = "";


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

                    System.out.println("Player2 chose : " + gameChoicePlayer2 + "\n");


                    finalOpponentchoice = gameChoicePlayer2;

//                    else if to decide mode choice of computer
                } else if(gameModeChoice.equalsIgnoreCase("computer")){

                    System.out.println("Player 1 will go first.");
                    System.out.println("Type 'rock', 'paper', or 'scissors'.");

                    gameChoicePlayer1 = input.nextLine();

//                    call generateRandomIntIntRange to generate random number to help make random choice for computer
                    randomInt = generateRandomIntIntRange(1, 9);

                    computerChoice = generateRandomChoice(randomInt);


//                    System.out.println("Random Game Choice: " + randomGameChoice);

                    finalOpponentchoice = computerChoice;

                } else {
                    System.out.println("Ooops, something went wrong!1!1!1");
                }


                checkWinnerOfGame(gameChoicePlayer1, finalOpponentchoice);


//                else if to continue if else logic for menuChoice
            } else if(menuChoice.equalsIgnoreCase("history")) {
                System.out.println("Yes you have game history. \n");
            } else if(menuChoice.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye now");
            } else {
                System.out.println("Something went wrong, please try again.");
            }


//            checks condition if player has chosen to quit the game
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

