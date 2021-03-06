package TxtEdit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader layoutLoader = new FXMLLoader(getClass().getResource("Layout.fxml"));
		Parent root = layoutLoader.load();

        primaryStage.setTitle("JavaFX Text Editor");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
	}
}