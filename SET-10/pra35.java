import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class practical_35 extends Application {

    public void start(Stage stage) {

        HBox root = new HBox(20);

        root.getChildren().add(createBar("Projects", 20, Color.RED));
        root.getChildren().add(createBar("Quizzes", 10, Color.BLUE));
        root.getChildren().add(createBar("Midterm", 30, Color.GREEN));
        root.getChildren().add(createBar("Final", 40, Color.ORANGE));

        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }

    VBox createBar(String name, int value, Color color) {
        Rectangle r = new Rectangle(40, value * 3);
        r.setFill(color);

        Text t = new Text(name + " - " + value + "%");

        VBox v = new VBox(5, r, t);
        return v;
    }

    public static void main(String[] args) {
        launch();
    }
}
