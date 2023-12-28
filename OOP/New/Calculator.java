package New;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    private Label resultLabel;
    private boolean firstOperandSet;
    private boolean secondOperandSet;
    private String operation;

    @Override
    public void start(Stage stage) {

        // Create the result label
        resultLabel = new Label("0");

        // Create the buttons
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button0 = new Button("0");
        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMultiply = new Button("*");
        Button buttonDivide = new Button("/");
        Button buttonEquals = new Button("=");
        Button buttonClear = new Button("C");

        // Set action handlers for buttons
        button1.setOnAction(e -> processNumber(1));
        button2.setOnAction(e -> processNumber(2));
        button3.setOnAction(e -> processNumber(3));
        button4.setOnAction(e -> processNumber(4));
        button5.setOnAction(e -> processNumber(5));
        button6.setOnAction(e -> processNumber(6));
        button7.setOnAction(e -> processNumber(7));
        button8.setOnAction(e -> processNumber(8));
        button9.setOnAction(e -> processNumber(9));
        button0.setOnAction(e -> processNumber(0));

        buttonPlus.setOnAction(e -> processOperation("+"));
        buttonMinus.setOnAction(e -> processOperation("-"));
        buttonMultiply.setOnAction(e -> processOperation("*"));
        buttonDivide.setOnAction(e -> processOperation("/"));

        buttonEquals.setOnAction(e -> {
            try {
                int num1 = Integer.parseInt(resultLabel.getText());
                int num2 = Integer.parseInt(resultLabel.getText());
                int result = performOperation(num1, num2, operation);
                resultLabel.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error");
            }
        });

        buttonClear.setOnAction(e -> {
            resultLabel.setText("0");
            firstOperandSet = false;
            secondOperandSet = false;
            operation = null;
        });

        // Layout the buttons
        VBox buttonBox = new VBox(10, button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonEquals, buttonClear);
        buttonBox.setAlignment(Pos.CENTER);

        // Create the scene
        Scene scene = new Scene(buttonBox, 250, 400);

        // Set the scene and show the stage
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }

    private void processNumber(int number) {
        if (firstOperandSet && !secondOperandSet) {
            resultLabel.setText("");
            secondOperandSet = true;
        }
        resultLabel.setText(resultLabel.getText() + number);
    }

    private void processOperation(String op) {
        if (firstOperandSet && !secondOperandSet) {
            operation = op;
        } else {
            int num1 = Integer.parseInt(resultLabel.getText());
            resultLabel.setText("");
            firstOperandSet = true;
            secondOperandSet = false;
            operation = op;
        }
    }

    private int performOperation(int num1, int num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    private Label resultLabel;
    private boolean firstOperandSet;
    private boolean secondOperandSet;
    private String operation;

    @Override
    public void start(Stage stage) {

        // Create the result label
        resultLabel = new Label("0");

        // Create the buttons
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button0 = new Button("0");
        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMultiply = new Button("*");
        Button buttonDivide = new Button("/");
        Button buttonEquals = new Button("=");
        Button buttonClear = new Button("C");

        // Set action handlers for buttons
        button1.setOnAction(e -> processNumber(1));
        button2.setOnAction(e -> processNumber(2));
        button3.setOnAction(e -> processNumber(3));
        button4.setOnAction(e -> processNumber(4));
        button5.setOnAction(e -> processNumber(5));
        button6.setOnAction(e -> processNumber(6));
        button7.setOnAction(e -> processNumber(7));
        button8.setOnAction(e -> processNumber(8));
        button9.setOnAction(e -> processNumber(9));
        button0.setOnAction(e -> processNumber(0));

        buttonPlus.setOnAction(e -> processOperation("+"));
        buttonMinus.setOnAction(e -> processOperation("-"));
        buttonMultiply.setOnAction(e -> processOperation("*"));
        buttonDivide.setOnAction(e -> processOperation("/"));

        buttonEquals.setOnAction(e -> {
            try {
                int num1 = Integer.parseInt(resultLabel.getText());
                int num2 = Integer.parseInt(resultLabel.getText());
                int result = performOperation(num1, num2, operation);
                resultLabel.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error");
            }
        });

        buttonClear.setOnAction(e -> {
            resultLabel.setText("0");
            firstOperandSet = false;
            secondOperandSet = false;
            operation = null;
        });

        // Layout the buttons
        VBox buttonBox = new VBox(10, button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonEquals, buttonClear);
        buttonBox.setAlignment(Pos.CENTER);

        // Create the scene
        Scene scene = new Scene(buttonBox, 250, 400);

        // Set the scene and show the stage
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }

    private void processNumber(int number) {
        if (firstOperandSet && !secondOperandSet) {
            resultLabel.setText("");
            secondOperandSet = true;
        }
        resultLabel.setText(resultLabel.getText() + number);
    }

    private void processOperation(String op) {
        if (firstOperandSet && !secondOperandSet) {
            operation = op;
        } else {
            int num1 = Integer.parseInt(resultLabel.getText());
            resultLabel.setText("");
            firstOperandSet = true;
            secondOperandSet = false;
            operation = op;
        }
    }

    private int performOperation(int num1, int num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}