package com.example.mytictactoe;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.Timer;

public class HelloController {

    @FXML
    private Button topLeft;

    @FXML
    private Label player1ButtonPressed;
    @FXML
    private Label player2ButtonPressed;


    @FXML
    private Label player1Score;

    @FXML
    private Label player2Score;
    @FXML
    private Button topMiddle;
    @FXML
    private Button topRight;
    @FXML
    private Button midLeft;
    @FXML
    private Button middle;
    @FXML
    private Button midRight;
    @FXML
    private Button botLeft;
    @FXML
    private Button bottomMiddle;
    @FXML
    private Button botRight;

    private String p = "X";


    private int topL = 3;
    private int topMid= 3;
    private int topR = 3;
    private int midMid = 3;
    private int midL = 3;
    private int midR = 3;
    private int botL = 3;
    private int botMid = 3;
    private int botR = 3;

    private int p1Score = 0;
    private int p2Score = 0;



    private void alternate()
    {
       if (p.equals("X"))
       {
           p = "O";
       }
       else {
           p = "X";
       }
    }

    


    @FXML
    protected void buttonClicked(ActionEvent event) throws InterruptedException {
        if (event.getSource().equals(topLeft))
        {
            topLeft.setText(p);
            if (p.equals("X"))
            {
                topL = 0;
            }
            else
            {
                topL = 1;
            }
            alternate();
            isWinning();

        }
        if (event.getSource().equals(topRight))
        {
            topRight.setText(p);
            if (p.equals("X"))
            {
                topR = 0;
            }
            else
            {
                topR = 1;
            }
            alternate();
            isWinning();
        }
        if (event.getSource().equals(topMiddle))
        {
            topMiddle.setText(p);
            if (p.equals("X"))
            {
                topMid = 0;
            }
            else
            {
                topMid = 1;
            }
            alternate();
            isWinning();
        }


        if (event.getSource().equals(midLeft))
        {
            midLeft.setText(p);
            if (p.equals("X"))
            {
                midL = 0;
            }
            else
            {
                midL = 1;
            }
            alternate();
            isWinning();
        }
        if (event.getSource().equals(middle))
        {
            middle.setText(p);
            if (p.equals("X"))
            {
                midMid = 0;
            }
            else
            {
                midMid = 1;
            }
            alternate();
            isWinning();
        }
        if (event.getSource().equals(midRight))
        {
            midRight.setText(p);
            if (p.equals("X"))
            {
                midR = 0;
            }
            else
            {
                midR = 1;
            }
            alternate();
            isWinning();
        }
        if (event.getSource().equals(botLeft))
        {
            botLeft.setText(p);
            if (p.equals("X"))
            {
                botL = 0;
            }
            else
            {
                botL = 1;
            }
            alternate();
            isWinning();
        }
        if (event.getSource().equals(bottomMiddle))
        {
            bottomMiddle.setText(p);
            if (p.equals("X"))
            {
                botMid = 0;
            }
            else
            {
                botMid = 1;
            }
            alternate();
            isWinning();
        }
        if (event.getSource().equals(botRight))
        {
            botRight.setText(p);
            if (p.equals("X"))
            {
                botR = 0;
            }
            else
            {
                botR = 1;
            }
            alternate();
            isWinning();

        }
    }

    @FXML
    protected void reset()
    {
        p = "X";
        topL = 3;
        topMid= 3;
        topR = 3;
        midMid = 3;
        midL = 3;
        midR = 3;
        botL = 3;
        botMid = 3;
        botR = 3;
        topMiddle.setText("");
        topLeft.setText("");
        topRight.setText("");
        midLeft.setText("");
        midRight.setText("");
        middle.setText("");
        botLeft.setText("");
        bottomMiddle.setText("");
        botRight.setText("");
        player1ButtonPressed.setText("");
        player2ButtonPressed.setText("");
        player1Score.setText("");
        player2Score.setText("");
        disableButton(false);
    }

    private void disableButton(boolean isDisable)
    {
        topLeft.setDisable(isDisable);
        topMiddle.setDisable(isDisable);
        topRight.setDisable(isDisable);
        middle.setDisable(isDisable);
        midRight.setDisable(isDisable);
        midLeft.setDisable(isDisable);
        botLeft.setDisable(isDisable);
        bottomMiddle.setDisable(isDisable);
        botRight.setDisable(isDisable);
    }

    @FXML
    private void isWinning() throws InterruptedException {

        // player1
        if (topL == 0 && topR == 0 && topMid == 0)
        {
            player1ButtonPressed.setText("Player X Wins!");
            disableButton(true);
            p1Score +=1;
        } else if (topL == 0 && botL == 0 && midL == 0) {
            player1ButtonPressed.setText("Player X Wins!");
            disableButton(true);
            p1Score +=1;
        } else if (topR == 0 && midR == 0 && botR == 0) {
            player1ButtonPressed.setText("Player X Wins!");
            disableButton(true);
            p1Score +=1;
        } else if (botR == 0 & botMid == 0 && botL == 0) {
            player1ButtonPressed.setText("Player X Wins!");
            disableButton(true);
            p1Score +=1;
        } else if (topR == 0 && midMid == 0 && botL == 0) {
            player1ButtonPressed.setText("Player X Wins!");
            disableButton(true);
            p1Score +=1;
        } else if (topL==0 && midMid==0 && botR==0) {
            player1ButtonPressed.setText("Player X Wins!");
            disableButton(true);
            p1Score +=1;
        } else if (topMid == 0 && midMid==0 && botMid==0) {
            player1ButtonPressed.setText("Player X Wins!");
            disableButton(true);
            p1Score +=1;
        }
        else if (midL == 0 && midMid==0 && midR==0) {
            player1ButtonPressed.setText("Player X Wins!");
            disableButton(true);
            p1Score +=1;
        }

        // player2
        if (topL == 1 && topR == 1 && topMid == 1)
        {
            player2ButtonPressed.setText("P2 Wins!");
            disableButton(true);
            p2Score +=1;
        } else if (topL == 1 && botL == 1 && midL == 1) {
            player2ButtonPressed.setText("P2 Wins!");
            disableButton(true);
            p2Score +=1;
        } else if (topR == 1 && midR == 1 && botR == 1) {
            player2ButtonPressed.setText("P2 Wins!");
            disableButton(true);
            p2Score +=1;
        } else if (botR == 1 & botMid == 1 && botL == 1) {
            player2ButtonPressed.setText("P2 Wins!");
            disableButton(true);
            p2Score +=1;
        } else if (topR == 1 && midMid == 1 && botL == 1) {
            player2ButtonPressed.setText("P2 Wins!");
            disableButton(true);
            p2Score +=1;
        } else if (topL==1 && midMid==1 && botR==1) {
            player2ButtonPressed.setText("P2 Wins!");
            disableButton(true);
            p2Score +=1;
        }
        else if (topMid == 1 && midMid==1 && botMid==1) {
            player2ButtonPressed.setText("P2 Wins!");
            disableButton(true);
            p2Score +=1;
        }
        else if (midL == 1 && midMid==1 && midR==1) {
            player1ButtonPressed.setText("P2 Wins!");
            disableButton(true);
            p2Score +=1;
        }

    }

    @FXML
    private void player1Score()
    {
        player1Score.setText("");
        player2Score.setText("");
        player1Score.setText("P1 score: " + p1Score);
    }
    @FXML
    private void player2Score()
    {
        player1Score.setText("");
        player2Score.setText("");
        player2Score.setText("P2 score: " + p2Score);
    }



    @FXML
    protected void ExitApp()
    {
        System.exit(0);
    }


}