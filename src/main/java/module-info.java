module com.example.mytictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mytictactoe to javafx.fxml;
    exports com.example.mytictactoe;
}