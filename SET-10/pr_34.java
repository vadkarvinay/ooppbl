import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class practical_34 extends Application {

    public void start(Stage stage) {

        GridPane grid = new GridPane();

        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();

        Button submit = new Button("Submit");

        grid.add(new Label("Roll No"), 0, 0); grid.add(roll, 1, 0);
        grid.add(new Label("Name"), 0, 1); grid.add(name, 1, 1);
        grid.add(new Label("Age"), 0, 2); grid.add(age, 1, 2);
        grid.add(new Label("Email"), 0, 3); grid.add(email, 1, 3);
        grid.add(submit, 1, 4);

        submit.setOnAction(e -> {
            try {
                Integer.parseInt(roll.getText());
                Integer.parseInt(age.getText());

                if (!email.getText().contains("@") || !email.getText().contains(".")) {
                    throw new Exception("Invalid Email");
                }

                new Alert(Alert.AlertType.INFORMATION, "Success").show();

            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, ex.getMessage()).show();
            }
        });

        stage.setScene(new Scene(grid, 300, 250));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
