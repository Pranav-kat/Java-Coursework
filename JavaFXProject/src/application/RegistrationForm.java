package application;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
//import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author TANMAY
 */
public class RegistrationForm extends Application{
    
	TextField name  =  new TextField();
	TextField reg   =  new TextField();
	TextField phone =  new TextField();
	TextField email =  new TextField();
	Button bt       =  new Button("Submit!");
	
        @Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
                pane.setPadding(new Insets(20,50,50,50));
		
		pane.setHgap(5);
		pane.setVgap(5);
		pane.add(new Label("Full Name : "), 0, 0);
		pane.add(name, 1, 0);
		pane.add(new Label("Registration No. : "), 0, 1);
		pane.add(reg, 1, 1);
		pane.add(new Label("Phone No. : "), 0, 2);
		pane.add(phone, 1, 2);
		pane.add(new Label("Email : "), 0, 3);
		pane.add(reg, 1, 3);
		pane.add(bt, 1, 4);
		
		pane.setAlignment(Pos.CENTER);
//		name.setAlignment(Pos.BOTTOM_RIGHT);
//		reg.setAlignment(Pos.BOTTOM_RIGHT);
//		phone.setAlignment(Pos.BOTTOM_RIGHT);
		/*email.setAlignment(Pos.BOTTOM_RIGHT);*/
		GridPane.setHalignment(bt, HPos.RIGHT);
		
		bt.setOnAction(e -> submitButton());
               
		
               
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("Hello!");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	private void submitButton() {
		System.out.println("You have successfully registered!");
	}
        
         public static void main(String[] args) {
		launch(args);
	}
    }