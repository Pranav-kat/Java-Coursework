package application;

import java.awt.Font;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class example1 extends Application{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		HBox hb = new HBox();
		
		
		GridPane pane = new GridPane();
		pane.add(new Label("V-TOP Online Examinations"), 3, 0);
		ImageView logo= new ImageView("https://image3.mouthshut.com/images/imagesp/925865869s.jpg");
		pane.add(logo, 2, 0);
		pane.add(new Label("VIT VELLORE"), 1, 0);
		pane.add(new Label("Authentication"), 2, 3);
		
		Font boldFont = new Font("Serif", Font.BOLD, 24);
		hb.setSpacing(30);
		hb.getChildren().addAll(logo, new Label("VIT VELLORE"),new Label("Authentication"));
		//pane.setBackground(new Background(new BackgroundFill(Color.rgb(140, 200, 140), new CornerRadii(0), new Insets(0))));
		pane.setStyle("-fx-background-color: #C0C0C0;");
		
		Scene scene = new Scene(pane);
	    primaryStage.setTitle("VTOP EXAMINATION"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show();
		
	}

}
