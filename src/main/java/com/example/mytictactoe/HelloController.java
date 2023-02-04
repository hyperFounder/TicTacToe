package com.example.mytictactoe;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button topLeft;
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
    private int P1score = 0;
    private int P2score = 0;
    private boolean setP1 = false;
    private boolean setP2 = false;

    private int topL = 3;
    private int topMid= 3;
    private int topR = 3;
    private int midMid;
    private int mid;
    private int midR;
    private int botL;
    private int botMid;
    private int botR;


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
    protected void buttonClicked(ActionEvent event)
    {
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
            alternate();
        }
        if (event.getSource().equals(middle))
        {
            middle.setText(p);
            alternate();
        }
        if (event.getSource().equals(midRight))
        {
            midRight.setText(p);
            alternate();
        }
        if (event.getSource().equals(botLeft))
        {
            botLeft.setText(p);
            alternate();
        }
        if (event.getSource().equals(bottomMiddle))
        {
            bottomMiddle.setText(p);
            alternate();
        }
        if (event.getSource().equals(botRight))
        {
            botRight.setText(p);
            alternate();
        }

    }

    @FXML
    protected void reset()
    {
        topMiddle.setText("");
        topLeft.setText("");
        topRight.setText("");
        midLeft.setText("");
        midRight.setText("");
        middle.setText("");
        botLeft.setText("");
        bottomMiddle.setText("");
        botRight.setText("");
    }


    private void isWinning()
    {
        if (topL == 0 && topR == 0 && topMid == 0)
        {
            System.out.println("Player X wins");
        }

    }
    @FXML
    protected void ExitApp()
    {
        System.exit(0);
    }


}