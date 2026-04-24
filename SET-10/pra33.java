import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.util.Random;

public class practical_33 extends Application {

    public void start(Stage stage) {

        VBox vbox = new VBox(10);
        vbox.setStyle("-fx-alignment: center;");

        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            Text t = new Text("Text " + i);
            t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            t.setFill(Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble()));
            t.setOpacity(0.3 + r.nextDouble() * 0.7);
            vbox.getChildren().add(t);
        }

        stage.setScene(new Scene(vbox, 400, 300));
        stage.setTitle("Text Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
