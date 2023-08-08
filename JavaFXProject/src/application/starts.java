package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class starts extends Application {

	Label l1 = new Label("Number 1");
	Label l2 = new Label("Number 2");
	Label l3 = new Label("Result");
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	TextField tf3 = new TextField();
	Button b0 = new Button("0");
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	Button b6 = new Button("6");
	Button b7 = new Button("7");
	Button b8 = new Button("8");
	Button b9 = new Button("9");
	Button sum = new Button("+");
	Button diff = new Button("-");
	Button prod = new Button("*");
	Button div = new Button("/");
	Button equal = new Button("=");
	Button clear = new Button("CLR");

	public starts() {
		tf1.setMaxWidth(100);
		tf1.setMaxHeight(50);
		tf2.setMaxWidth(30);
		tf3.setMaxWidth(50);
		b0.setAlignment(Pos.CENTER);
		b1.setAlignment(Pos.CENTER);
		b2.setAlignment(Pos.CENTER);
		b3.setAlignment(Pos.CENTER);
		b4.setAlignment(Pos.CENTER);
		b5.setAlignment(Pos.CENTER);
		b6.setAlignment(Pos.CENTER);
		b7.setAlignment(Pos.CENTER);
		b8.setAlignment(Pos.CENTER);
		b9.setAlignment(Pos.CENTER);
		clear.setAlignment(Pos.CENTER);

	}

	int n3;

	void Add() {
		String s = tf1.getText();
		int n = s.length();
		double n1 = 0, n2 = 0, n3 = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '+') {
				n1 = Double.parseDouble(s.substring(0, i));
				n2 = Double.parseDouble(s.substring(i + 1, n));
			}
		}
		n3 = n1 + n2;
		tf1.setText(Double.toString(n3));
	}

	void Subtract() {
		String s = tf1.getText();
		int n = s.length();
		double n1 = 0, n2 = 0, n3 = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '-') {
				n1 = Double.parseDouble(s.substring(0, i));
				n2 = Double.parseDouble(s.substring(i + 1, n));
			}
		}
		n3 = n1 - n2;
		tf1.setText(Double.toString(n3));
	}

	void Multiply() {
		String s = tf1.getText();
		int n = s.length();
		double n1 = 0, n2 = 0, n3 = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '*') {
				n1 = Double.parseDouble(s.substring(0, i));
				n2 = Double.parseDouble(s.substring(i + 1, n));
			}
		}
		n3 = n1 * n2;
		tf1.setText(Double.toString(n3));
	}

	void Divide() {
		String s = tf1.getText();
		int n = s.length();
		double n1 = 0, n2 = 0, n3 = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '/') {
				n1 = Double.parseDouble(s.substring(0, i));
				n2 = Double.parseDouble(s.substring(i + 1, n));
				if (n2 == 0) {
					tf1.setText("Division by 0 not possible");
					break;
				}
			}
		}
		n3 = n1 / n2;
		tf1.setText(Double.toString(n3));
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		tf1.setText("");
		sum.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("+"));
		});
		diff.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("-"));
		});
		prod.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("*"));
		});
		div.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("/"));
		});
		equal.setOnAction((ActionEvent t) -> {
			int n = tf1.getText().length();
			int count = 0;
			for (int i = 0; i < n; i++) {
				switch (tf1.getText().charAt(i)) {
				case '+':
					count = 1;
					break;
				case '-':
					count = 2;
					break;
				case '*':
					count = 3;
					break;
				case '/':
					count = 4;
					break;
				default:
				}
			}
			switch (count) {
			case 1:
				Add();
				break;
			case 2:
				Subtract();
				break;
			case 3:
				Multiply();
				break;
			case 4:
				Divide();
				break;
			default:
			}
		});
		b0.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("0"));
		});
		b1.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("1"));
		});
		b2.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("2"));
		});
		b3.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("3"));
		});
		b4.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("4"));
		});
		b5.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("5"));
		});
		b6.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("6"));
		});
		b7.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("7"));
		});
		b8.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("8"));
		});
		b9.setOnAction((ActionEvent t) -> {
			tf1.setText(tf1.getText().concat("9"));
		});
		clear.setOnAction((ActionEvent t) -> {
			tf1.setText("");
		});

		GridPane p = new GridPane();
		GridPane p1 = new GridPane();
		p1.add(tf1, 0, 0);
		p.add(b7, 0, 1);
		p.add(b8, 1, 1);
		p.add(b9, 2, 1);
		p.add(div, 3, 1);
		p.add(b4, 0, 2);
		p.add(b5, 1, 2);
		p.add(b6, 2, 2);
		p.add(prod, 3, 2);
		p.add(b1, 0, 3);
		p.add(b2, 1, 3);
		p.add(b3, 2, 3);
		p.add(diff, 3, 3);
		p.add(b0, 0, 4);
		p.add(equal, 1, 4);
		p.add(sum, 2, 4);
		p.add(clear, 3, 4);
		BorderPane p2 = new BorderPane();
		p2.setTop(p1);
		p2.setCenter(p);

		Scene scene = new Scene(p2, 200, 250);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}