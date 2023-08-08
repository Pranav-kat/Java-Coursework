package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Pranav Katte 20BCE0130
 */
public class name extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("x");
        Button div = new Button("/");
        Button zero = new Button("0");
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button clr = new Button("C");
        Button dot = new Button(".");
        Button eql = new Button("=");
       
        
        dot.setPrefSize(35, 35);
        add.setPrefSize(35, 35);
        sub.setPrefSize(35, 35);
        mul.setPrefSize(35, 35);
        div.setPrefSize(35, 35);
        zero.setPrefSize(35, 35);
        one.setPrefSize(35, 35);
        two.setPrefSize(35, 35);
        three.setPrefSize(35, 35);
        four.setPrefSize(35, 35);
        five.setPrefSize(35, 35);
        six.setPrefSize(35, 35);
        seven.setPrefSize(35, 35);
        eight.setPrefSize(35, 35);
        nine.setPrefSize(35, 35);
        clr.setPrefSize(35, 35);
        eql.setPrefSize(35, 35);
        
        
         int op1;
        TextField dis = new TextField();
        TextField tf = new TextField();
        dis.setMaxWidth(160);
//        dis.setAlignment(Pos.TOP_LEFT);
        
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10,50,50,50));
//        Button btn = new Button();
        
        add.setOnAction((ActionEvent event) -> {
            
            String s = dis.getText();
            s=s+"+";
            dis.setText("");
            String po = dis.getText();
            dis.setText(s.concat(po));
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='+'){
                   int n1 = Integer.parseInt(s.substring(0,i));
                   int n2 =  Integer.parseInt(s.substring(i+1,s.length()));
                   int n3=n1+n2;
                }
            }
            
          
            
            tf.setText(dis.getText());
            System.out.println(s);
            
            
        });
        
        sub.setOnAction((ActionEvent event) -> {
            String s = dis.getText();
            s=s+"-";
            dis.setText("");
            String po = dis.getText();
            dis.setText(s.concat(po));
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='-'){
                   int n1 = Integer.parseInt(s.substring(0,i));
                   int n2 =  Integer.parseInt(s.substring(i+1,s.length()));
                   int n3=n1-n2;
                }
            }
            
          
            
            tf.setText(dis.getText());
            System.out.println(s);
        });
        
        
        mul.setOnAction((ActionEvent event) -> {
             String s = dis.getText();
            s=s+"x";
            dis.setText("");
            String po = dis.getText();
            dis.setText(s.concat(po));
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='x'){
                   int n1 = Integer.parseInt(s.substring(0,i));
                   int n2 =  Integer.parseInt(s.substring(i+1,s.length()));
                   int n3=n1*n2;
                }
            }
            
          
            
            tf.setText(dis.getText());
            System.out.println(s);
        });
        
        
        div.setOnAction((ActionEvent event) -> {
             String s = dis.getText();
            s=s+"/";
            dis.setText("");
            String po = dis.getText();
            dis.setText(s.concat(po));
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='/'){
                   int n1 = Integer.parseInt(s.substring(0,i));
                   int n2 =  Integer.parseInt(s.substring(i+1,s.length()));
                   int n3=n1/n2;
                }
            }
          
            
            tf.setText(dis.getText());
            System.out.println(s);
        });
        
        
        zero.setOnAction((ActionEvent event) -> {
            dis.setText("0");
        });
        
        
        one.setOnAction((ActionEvent event) -> {
            dis.setText("1");
        });
        
        
        two.setOnAction((ActionEvent event) -> {
            dis.setText("2");
        });
        
        
        three.setOnAction((ActionEvent event) -> {
            dis.setText("3");
        });
        
        
        four.setOnAction((ActionEvent event) -> {
            dis.setText("4");
        });
        
        
        five.setOnAction((ActionEvent event) -> {
            dis.setText("5");
        });
        
        
        six.setOnAction((ActionEvent event) -> {
            dis.setText("6");
        });
        
        
        seven.setOnAction((ActionEvent event) -> {
            dis.setText("7");
        });
        
        
        eight.setOnAction((ActionEvent event) -> {
            dis.setText("8");
        });
        
        
        nine.setOnAction((ActionEvent event) -> {
            dis.setText("9");
        });
        
        
        clr.setOnAction((ActionEvent event) -> {
            dis.setText(null);
        });
        
        
        dot.setOnAction((ActionEvent event) -> {
            dis.setText(".");
        });
        
        
        eql.setOnAction((ActionEvent event) -> {
            
              
        });
        
        
        
        
        
        
        
        GridPane rootg = new GridPane();
        StackPane root = new StackPane();
        //root.add(new )
        root.getChildren().add(dis);
        rootg.add(clr,0,0);
        rootg.add(eql, 3, 0);
        rootg.add(seven, 0, 1);
        rootg.add(eight, 1, 1);
        rootg.add(nine, 2, 1);
        rootg.add(add, 3, 1);
        rootg.add(four, 0, 2);
        rootg.add(five, 1, 2);
        rootg.add(six, 2, 2);
        rootg.add(sub, 3, 2);
        rootg.add(one, 0, 3);
        rootg.add(two, 1, 3);
        rootg.add(three, 2, 3);
        rootg.add(mul, 3, 3);
        rootg.add(zero, 1, 4);
        rootg.add(dot, 2, 4);
        rootg.add(div, 3, 4);
        
        bp.setCenter(rootg);
        bp.setTop(root);
        
        
        
        Scene scene = new Scene(bp, 300, 250,Color.CHARTREUSE);
        primaryStage.setResizable(false); // the application's size is fixed. 
        primaryStage.setTitle("20BCE0130 Pranav's Arithmetic Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

