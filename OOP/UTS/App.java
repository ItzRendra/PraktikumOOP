package UTS;
import javafx;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a StackPane layout container
        StackPane root = new StackPane();

        // Create a Label object with a message for the user
        Label message = new Label("Hello, JavaFX!");

        // Create a Button object with a label
        Button button = new Button("Click me!");

        // Set an ActionEvent event handler for the button
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Change the message of the Label when the button is clicked
                message.setText("Hello, JavaFX! You clicked the button.");
            }
        });

        // Add the Button and Label to the StackPane
        root.getChildren().addAll(button, message);

        // Create a new scene by calling the Scene constructor
        Scene scene = new Scene(root, 300, 250);

        // Set the scene on the primary stage
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
