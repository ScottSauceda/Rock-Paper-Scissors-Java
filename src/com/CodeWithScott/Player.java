package com.CodeWithScott;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private String playerChoice;
    private String playerGameStat;
    private String playerWinOrLose;
    private String finalOpponentchoice;
    private int playerScore;

    ArrayList<String> playerHistory = new ArrayList<String>();

    Scanner input = new Scanner(System.in);


    public void setPlayerChoice(){
        System.out.println("Type 'rock', 'paper', or 'scissors'.");

        playerChoice = input.nextLine();
        this.playerChoice = playerChoice;
    }

    public String getPlayerChoice(){
        return playerChoice;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerScore(){
        return playerScore;
    }

    public void setPlayerWinOrLose(String playerWinOrLose, String finalOpponentchoice){
        this.playerWinOrLose = playerWinOrLose;
        this.finalOpponentchoice = finalOpponentchoice;
    }

    public void addToGameHistory(String playerChoice, String finalOpponentchoice, String playerWinOrLose){
        this.playerHistory.add("\n" + playerWinOrLose + " : " +
                " Player picked " + playerChoice + ", " +
                " Opponent picked " + finalOpponentchoice + "\n");
    }

    public String getGameHistory(){
        return Arrays.toString(playerHistory.toArray());
    }




}
