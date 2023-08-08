package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyFX extends Application {
	// event driven programming = interactor
	// button click is called event
	// button --> event--> handler
	// first find the source object --> then define correspond type of event. -->
	// the event handler processes the event
	// types of event:
	// action events --> button click (button, radio button, checkbox, textfield,
	// combobox.
	// mouse events --> mouse click, scroll, hover
	// key event --> pressing a key on a keyboard
	// listener --> interface, which works like a server waiting for an event
	// occurring
	// event registration- informing the jvm that if i click on this event, pls
	// execute this
	// setOnAction used to do event reg for action events
	// event handler - generic interface
	// setOnMoousePressed/Clicked/Entered/Exited/Released/Moved used to do event reg
	// for mouse events
	// setOnKeyPressed/Released/Entered used to do event registration for key events

	// --------------------------------------------------------------------------------------------------------------------//
	int i = 8;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button b = new Button("Register"); // source --> button
		Text text = new Text();
		text.setText("Cheese burger is not healthy");
		ButtonHandler obj = new ButtonHandler();

		b.setOnAction(obj); // directly create anonymous object by b.setOnAction(new ButtonHandler();

		// another method by creating anonymous inner class
		/*
		 * b.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent t) { // TODO Auto-generated method
		 * stub System.out.println("Button clicked");
		 * 
		 * } } );
		 */

		// another method --> lambda expression
		/*
		 * b.setOnAction((ActionEvent) -> { System.out.println("Button clicked");
		 * 
		 * } );
		 */

		GridPane pane = new GridPane(); 
		pane.add(text,0,1);
		pane.add(b, 0, 2);

		Scene scene = new Scene(pane, 200, 250);

		primaryStage.setTitle("Hello PAK");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(); // internally calls start
	}

	void registerButton() {
		System.out.println("Button clicked!!" + i);
	}

}

class ButtonHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent t) {
		// TODO Auto-generated method stub
		System.out.println("Button clicked");

	}

}
