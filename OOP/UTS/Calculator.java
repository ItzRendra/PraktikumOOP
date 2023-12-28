package UTS;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    
    private Label resultLabel;

    @Override
    public void start(Stage stage) {
        
        // Create the result label
        resultLabel = new Label("0");
        
        // Create the buttons
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button buttonPlus = new Button("+");
        Button buttonEquals = new Button("=");
        
        // Set action handlers for buttons
        button1.setOnAction(e -> resultLabel.setText("1")); 
        button2.setOnAction(e -> resultLabel.setText("2"));
        
        buttonPlus.setOnAction(e -> {
            int num1 = Integer.parseInt(resultLabel.getText()); 
            resultLabel.setText("");
        });
        
        buttonEquals.setOnAction(e -> {
            int num1 = Integer.parseInt(resultLabel.getText());
            int num2 = Integer.parseInt(resultLabel.getText());
            int result = num1 + num2;
            resultLabel.setText(String.valueOf(result)); 
        });
        
        // Layout
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(resultLabel, button1, button2, buttonPlus, buttonEquals);
        
        // Show scene
        Scene scene = new Scene(root, 250, 150);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } 
}