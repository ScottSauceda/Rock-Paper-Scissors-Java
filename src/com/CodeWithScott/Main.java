package com.CodeWithScott;

import java.util.Scanner;

public class Main {



    public static String checkWinnerOfGame(String player1Choice, String opponentChoice){
//        if else logic to check who won the game
        String playerWinOrLose;
        if(player1Choice.equals("rock") && opponentChoice.equals("scissors") || player1Choice.equals("scissors") && opponentChoice.equals("paper") || player1Choice.equals("paper") && opponentChoice.equals("rock")){
            System.out.println("Player1 won! \n");
            playerWinOrLose = "Won";
            return playerWinOrLose;
        } else if(opponentChoice.equals("rock") && player1Choice.equals("scissors") || opponentChoice.equals("scissors") && player1Choice.equals("paper") || opponentChoice.equals("paper") && player1Choice.equals("rock")){
            System.out.println("Player 1 Lost! \n");
            playerWinOrLose = "Lost";
            return playerWinOrLose;
        } else {
            System.out.println("It's a tie game! \n");
            playerWinOrLose = "Tie";
            return playerWinOrLose;
        }

    }



    public static void main(String[] args) {

        System.out.println("Welcome to Rock, Paper, Scissors \n");

        String gameChoicePlayer1 = "";

        String gameChoicePlayer2 = "";

        String gameModeChoice = "";

        String finalOpponentchoice = "";

        String menuChoice = "";

        String playerWinOrLose = "";

        int randomInt;

        Player player1 = new Player();



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

                System.out.println("Player 1 must choose.");

                player1.setPlayerChoice();

                gameChoicePlayer1 = player1.getPlayerChoice();

//              If to begin game mode choice of 2 players or computer
                if(gameModeChoice.equalsIgnoreCase("2 players")){

                    Player player2 = new Player();

                    System.out.println("Player 2 must choose.");

                    player2.setPlayerChoice();

                    gameChoicePlayer2 = player2.getPlayerChoice();

                    finalOpponentchoice = gameChoicePlayer2;

//                    else if to decide mode choice of computer
                } else if(gameModeChoice.equalsIgnoreCase("computer")){


                    Computer computerPlayer = new Computer();

                    randomInt = computerPlayer.generateRandomIntIntRange(1,9);

                    finalOpponentchoice = computerPlayer.generateRandomChoice(randomInt);


                } else {
                    System.out.println("Oops, something went wrong!1!1!1");
                }

                playerWinOrLose = checkWinnerOfGame(gameChoicePlayer1, finalOpponentchoice);

                player1.setPlayerWinOrLose(playerWinOrLose, finalOpponentchoice);

                player1.addToGameHistory(gameChoicePlayer1, finalOpponentchoice, playerWinOrLose);

//                else if to continue if else logic for menuChoice
            } else if(menuChoice.equalsIgnoreCase("history")) {
                System.out.println("Yes you have game history. \n");

                System.out.println(player1.getGameHistory());

            } else if(menuChoice.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye now");
            } else {
                System.out.println("Something went wrong, please try again.");
            }


//            checks condition if player has chosen to quit the game
        } while(!menuChoice.equals("quit"));

//        System.out.println("history");
//        System.out.println("Win: Player picked rock, computer picked scissors");
//        System.out.println("Loss: Player picked paper, computer picked scissors");

    }
}

