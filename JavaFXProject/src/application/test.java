package application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.event.ActionEvent;
//import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.scene.effect.DropShadow;
//import javafx.scene.effect.Reflection;
//import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
//import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Pranav
 */
public class test extends Application {
    
   
	@Override
    public void start(Stage stage) {
        //String checkUser, checkPw;
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10,50,50,50));
        
        HBox hb = new HBox();
        hb.setPadding(new Insets(20,20,20,30));
        hb.setBackground(new Background(new BackgroundFill(Color.BEIGE,null,null)));;
        Button btn = new Button();
        btn.setText("Authenticate");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                if(username.getText().equals("Pranav")){
//              System.out.println("Successful");
//          }else{
//                    System.out.println("Try again");
//                }
//System.out.println("Ok");
//            }
//        });
        
        
        GridPane root = new GridPane();
        
        root.setPadding(new Insets(20,20,20,20));
        root.setHgap(5);
        root.setVgap(5);
        
       //Image icon = new Image("1213382.jpg");
       
             
            
       
       //      ------  scene--------\\
       
      /* Text test = new Text("Whoaaaaa!!??");
       test.setX(50);
       test.setY(50);
       test.setFont(Font.font("Verdana",50));
       test.setFill(Color.BLUEVIOLET);
       
       Line line = new Line();
       line.setStartX(200);
       line.setStartY(200);
       line.setEndX(500);
       line.setEndY(200);
       
       root.getChildren().add(line);
       root.getChildren().add(test);*/
      //root.getChildren().add(btn);
      
        final TextField username = new TextField();
        final PasswordField password = new PasswordField();
        final Label lblMessage = new Label();
       root.add(new Label ("Username"),0,0);
       root.add(username,1,0);
       root.add(new Label("Password"),0,1);
       root.add(password,1,1);
       root.add(btn,2,1);
       root.add(lblMessage, 1, 2);
       root.add(new Label("OKay"),2,3);
       
//       gridPane.add(lblUserName, 0, 0);
//        gridPane.add(txtUserName, 1, 0);
//        gridPane.add(lblPassword, 0, 1);
//        gridPane.add(pf, 1, 1);
//        gridPane.add(btnLogin, 2, 1);
//        gridPane.add(lblMessage, 1, 2);
       
       
       
//       DropShadow dropShadow = new DropShadow();
//        dropShadow.setOffsetX(5);
//        dropShadow.setOffsetY(5);
       
       Text text = new Text("JavaFX 2 Login");
        text.setFont(Font.font("Courier New", FontWeight.BOLD, 28));
        //text.setEffect(dropShadow);
         
        //Adding text to HBox
        hb.getChildren().add(text);
                           
        //Add ID's to Nodes
//        bp.setId("bp");
//        root.setId("root");
//        btn.setId("btnLogin");
//        text.setId("text");
        
//        RadioButton rb2 = new RadioButton("Calendar");
//        Image image = new Image("https://png.pngtree.com/element_our/sm/20180301/sm_5a9797d5c93d3.jpg");
//        RadioButton rb = new RadioButton("Agree");
//        rb.setGraphic(new ImageView(image));
        
        final ToggleGroup group = new ToggleGroup();
//        GridPane gg = new GridPane();
//        gg.setPadding(new Insets(2,2,2,2));
//        gg.setHgap(3);
//        gg.setVgap(3);
        

        RadioButton rb1 = new RadioButton("Home");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        //gg.add(rb1, 0, 0);

        RadioButton rb7 = new RadioButton("Calendar");
        rb7.setToggleGroup(group);
        //gg.add(rb1, 1, 0);
        
        RadioButton rb3 = new RadioButton("Contacts");
        rb3.setToggleGroup(group);
       // gg.add(rb1, 0, 1);
        
       //bp.setBottom(gg);
       bp.setTop(hb);
       bp.setCenter(root);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent event) {
          String checkUser = username.getText();
          String checkPw = password.getText();
          if(checkUser.equals("user") && checkPw.equals("pass")){
           lblMessage.setText("Congratulations!");
           lblMessage.setTextFill(Color.GREEN);
          }
          else{
           lblMessage.setText("Incorrect user or pw.");
           lblMessage.setTextFill(Color.RED);
          }
          username.setText("");
          password.setText("");
         }

            
         });
         //       Reflection r = new Reflection();
//        r.setFraction(0.7f);
//        root.setEffect(r);
       
       
//       public void login(ActionEvent event){
//           if(username.getText().equals("Pranav")){
//               System.out.println("Successful");
//           }
//           
//       }
Scene scene = new Scene(bp,500,500, Color.AZURE);
//stage.getIcons().add(icon);
       stage.setTitle("My mine");
       stage.setWidth(420);
       stage.setHeight(420);
       stage.setResizable(false);
       stage.setX(50);
       stage.setY(50);
       //stage.setFullScreen(true);
       stage.setFullScreenExitHint("You can't escape unless you press 'O' ");
       stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("O"));
       stage.setScene(scene);
       stage.show();
       
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
