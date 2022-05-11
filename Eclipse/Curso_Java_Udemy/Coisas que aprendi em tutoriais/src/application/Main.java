package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);			
			primaryStage.setScene(scene);
			primaryStage.setTitle("My First JavaFX App");
			Label label = new Label("Hello World, JavaFX!");
			Scene scene2 = new Scene(label, 400, 200);
			primaryStage.setScene(scene2);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
