package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.zip.ZipEntry;

public class Hello extends Application {
    @Override
    public void start(Stage PrimaryStage) throws IOException {
        //Setting various regions in border pane
        BorderPane bardenPane = new BorderPane();
        //bardenPane.autosize();
        HBox hbox = addHBox();
        bardenPane.setTop(hbox);
        bardenPane.setLeft(leftmenu());
        bardenPane.setBottom(btmmenu());
        //Setting the scene
        bardenPane.setCenter(labeltext);
        Scene scene = new Scene(bardenPane);
        PrimaryStage.setScene(scene);
        PrimaryStage.setWidth(1000);
        PrimaryStage.setHeight(800);
        PrimaryStage.show();
    }

    public HBox addHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 15, 15, 15));
        hbox.setSpacing(30);
        hbox.setStyle("-fx-background-color: #677864;");

        Label Title = new Label("Vellore Institute of Technology");
        Title.setFont(Font.font("Bodoni MT", FontWeight.BOLD, 65));
        ImageView logo= new ImageView("https://image3.mouthshut.com/images/imagesp/925865869s.jpg");
                topmenu1();

        hbox.getChildren().addAll(logo, Title,topmenu1());

        return hbox;
    }

    public Label labeltext = new Label("Hello,Welcome to the portal.");

    //CREATING BOTTOM MENU
    public VBox topmenu1() {
        VBox lftmenu = new VBox();
        lftmenu.setPadding(new Insets(10));
        lftmenu.setSpacing(8);

        ImageView photo=new ImageView("https://www.freeiconspng.com/thumbs/profile-icon-png/profile-picture-icon-png-people-person-profile--4.png");
        lftmenu.getChildren().add(photo);
        Text registration = new Text("20BDS0312");

        lftmenu.getChildren().add(registration);

        return lftmenu;
    }
    //CREATING BOTTOM MENU
    public Node btmmenu() {
        //Creating bottom menu for facebook
        HBox bottommenu = new HBox();
        VBox btm=new VBox();

        Button W = new Button();
        W.setMaxSize(10, 10);
        W.setGraphic(new ImageView("https://png.pngtree.com/png-clipart/20181008/ourmid/pngtree-facebook-logo-icon-design-vector-free-logo-design-template-png-image_3652951.png"));
        W.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome to Facebook through www.facebook.com");
            }});

        Button X = new Button();
        X.setMaxSize(10, 10);
        X.setGraphic(new ImageView("https://png.pngtree.com/element_our/png/20181011/instagram-social-media-icon-design-template-vector-png_126996.jpg"));
        X.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome to INSTAGRAM through www.instagram.com");
            }});

        Button Y = new Button();
        Y.setMaxSize(10, 10);
        Y.setGraphic(new ImageView("https://png.pngtree.com/png-clipart/20181003/ourmid/pngtree-twitter-social-media-icon-design-template-vector-png-image_3654784.png"));
        Y.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome to twitter through www.twitter.com");
            }});

        Button Z = new Button();
        Z.setMaxSize(10, 10);
        Z.setGraphic(new ImageView("https://png.pngtree.com/element_our/sm/20180301/sm_5a9797d5c93d3.jpg"));
        Z.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome to Youtube through www.youtube.com");
            }});
        
        bottommenu.getChildren().addAll(W, X, Y, Z);

        Label label2 = new Label("Copyright to VIT");

        btm.getChildren().addAll(bottommenu,label2);

        return btm;
    }
    //CREATING LEFT MENU
    public VBox leftmenu() {
        //Creating left menu for buttons
        VBox lftmenu = new VBox();
        lftmenu.setPadding(new Insets(12));
        lftmenu.setSpacing(8);


        Button Info = new Button("My Info");
        Info.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome to Information portal.");
            }
        });

        Button Acad = new Button("Academics");
        Acad.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome To Academics Portal.");
            }
        });

        Button Exam = new Button("Examinations");
        Exam.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome to Examinations Portal.");
            }
        });

        Button Hostel = new Button("Hostels");
        Hostel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome To Hostels Portal.");
            }
        });

        Button Sport = new Button("Sports");
        Sport.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labeltext.setText("Welcome To Sports Portal.");
            }
        });

        lftmenu.getChildren().addAll(Info,Acad,Exam,Hostel,Sport);


        return lftmenu;
    }


    public static void main(String[] args) {
        launch(args);
    }
}


