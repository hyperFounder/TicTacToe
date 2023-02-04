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


    private void alternate()
    {
       if (p.equals("X"))
       {
           p = "O";
       }
       else
       {
           p = "X";
       }
    }

    @FXML
    protected void buttonClicked(ActionEvent event)
    {
        if (event.getSource().equals(topLeft))
        {
            topLeft.setText(p);
            alternate();
        }
        if (event.getSource().equals(topRight))
        {
            topRight.setText(p);
            alternate();
        }
        if (event.getSource().equals(topMiddle))
        {
            topMiddle.setText(p);
            alternate();
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
    protected void ExitApp()
    {
        System.exit(0);
    }


}