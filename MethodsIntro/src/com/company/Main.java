package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        displayHighScorePosition("A", calculateHighScorePosition(1500));
        displayHighScorePosition("B", calculateHighScorePosition(900));
        displayHighScorePosition("C", calculateHighScorePosition(400));
        displayHighScorePosition("D", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if(gameOver){

            return score + (levelCompleted*bonus);
        }
        return -1;
    }

    public static void displayHighScorePosition( String playerName, int position) {
        System.out.println( playerName+ " managed to get into posotion "+ position + " on the high score table.");
    }

    public static int calculateHighScorePosition ( int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if(playerScore>=500) { //here, I removed checking condition playerScore < 1000 coz it's redundant
            return 2;
        }
        else if(playerScore>=100) { //here, I removed checking condition playerScore < 500 coz it's redundant
            return 3;
        }
            return 4;

    }

}