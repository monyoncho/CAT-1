import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ButtonBase;
import javafx.scene.Group;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Toggle;
import javafx.scene.input.MouseEvent; 
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;
import javafx.scene.control.Label;
import java.io.FileNotFoundException;
import javafx.scene.canvas.*; 
import java.io.*;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Background;
import javafx.beans.value.*;
import javafx.scene.text.*;


public class CAT1 extends Application
{ 
	public static void main(String[] args)
	{
		launch(args);
	}


	public void start(Stage stage)
	{
		Text text1 = new Text("*    are required fields:");
		Text text2 = new Text("FIRST and LAST NAME*");
		Text text3 = new Text("SURNAME*");
		Text text4 = new Text("EMAIL*");
		Text text5 = new Text("USERNAME*"); 
		Text text6 = new Text("PASSWORD*"); 
		Text text7 = new Text("CONFIRM PASSWORD*"); 
		Text text8 = new Text("DATE OF BIRTH"); 
		Text text9 = new Text("P.O BOX");
		Text text10 = new Text("GENDER");
		Text text11 = new Text("KAFFI'S KITCHEN");
		Text text12 = new Text("Already have an Account?");



		TextField textField1 = new TextField();
		textField1.setStyle("-fx-font-family: Quicksand; -fx-font-size: 15; -fx-padding: 1,1,1,1; -fx-border-color: grey; -fx-border-width: 2; -fx-border-radius: 1;  -fx-border: gone;  -fx-background-color: NavajoWhite; -fx-text-fill: black;"); 
		textField1.setPrefWidth(200);      
		textField1.setPrefHeight(35);


		TextField textField2 = new TextField();
		textField2.setStyle(" -fx-font-family: Quicksand; -fx-font-size: 15; -fx-padding: 1,1,1,1; -fx-border-color: grey; -fx-border-width: 2; -fx-border-radius: 1;  -fx-border: gone;  -fx-background-color: NavajoWhite; -fx-text-fill: black;");
		textField2.setPrefWidth(200);      
		textField2.setPrefHeight(35);


		TextField textField3 = new TextField();
		textField3.setStyle(" -fx-font-family: Quicksand; -fx-font-size: 15; -fx-padding: 1,1,1,1; -fx-border-color: grey; -fx-border-width: 2; -fx-border-radius: 1;  -fx-border: gone;  -fx-background-color: NavajoWhite; -fx-text-fill: black;");
		textField3.setPrefWidth(200);      
		textField3.setPrefHeight(35);


		TextField textField4 = new TextField();
		textField4.setStyle("-fx-font-family: Quicksand; -fx-font-size: 15; -fx-padding: 1,1,1,1; -fx-border-color: grey; -fx-border-width: 2; -fx-border-radius: 1;  -fx-border: gone;  -fx-background-color: NavajoWhite; -fx-text-fill: black;");
		textField4.setPrefWidth(200);      
		textField4.setPrefHeight(35);


		PasswordField passwordField1 = new PasswordField();
		passwordField1.setStyle(" -fx-font-family: Quicksand; -fx-font-size: 15; -fx-padding: 1,1,1,1; -fx-border-color: grey; -fx-border-width: 2; -fx-border-radius: 1;  -fx-border: gone;  -fx-background-color: NavajoWhite; -fx-text-fill: black;");
		passwordField1.setPrefWidth(200);      
		passwordField1.setPrefHeight(35);


		PasswordField passwordField2 = new PasswordField();
		passwordField2.setStyle(" -fx-font-family: Quicksand; -fx-font-size: 15; -fx-padding: 1,1,1,1; -fx-border-color: grey; -fx-border-width: 2; -fx-border-radius: 1;  -fx-border: gone;  -fx-background-color: NavajoWhite; -fx-text-fill: black;");
		passwordField2.setPrefWidth(200);      
		passwordField2.setPrefHeight(35);


		TextField textField7 = new TextField();
		textField7.setStyle(" -fx-font-family: Quicksand; -fx-font-size: 15; -fx-padding: 1,1,1,1; -fx-border-color: grey; -fx-border-width: 2; -fx-border-radius: 1;  -fx-border: gone;  -fx-background-color: NavajoWhite; -fx-text-fill: black;");
		textField7.setPrefWidth(200);      
		textField7.setPrefHeight(35);

		



	    DatePicker datePicker = new DatePicker();
 		datePicker.setOnAction
 		(e -> 
 			{
     			LocalDate date = datePicker.getValue();
     			System.err.println("Selected date: " + date);
 			}
 		);



	    

	    final ToggleGroup toggleGroup1 = new ToggleGroup(); 

	    RadioButton male = new RadioButton("Male");	    
	    male.setToggleGroup(toggleGroup1);
	    male.setSelected(true);
	    

	    RadioButton female = new RadioButton("Female");	  
	    female.setToggleGroup(toggleGroup1);



	    CheckBox checkBox1 = new CheckBox("I have Read and Agreed to the Terms and Conditions");

	    checkBox1.setStyle("-fx-font-size:10; -fx-font-weight:bold; -fx-border-color:grey; -fx-border-radius:3px; ");     
        




		Button button1 = new Button("Complete Registration");
		Button button2 = new Button("Sign In");




		
		GridPane gridPane = new GridPane();

		
		gridPane.setMinSize(600, 600);

		
		gridPane.setPadding(new Insets(20, 20, 20, 20));

		
		gridPane.setVgap(10);
		gridPane.setHgap(10);

		
		gridPane.setAlignment(Pos.CENTER);

		gridPane.add(text11, 0, 0);

		gridPane.add(text1, 0, 1);

		gridPane.add(text2, 0, 2);

		gridPane.add(text3, 1, 2);
		
		gridPane.add(textField1, 0, 3);

		gridPane.add(textField2, 1, 3);

		gridPane.add(text4, 0, 4);

		gridPane.add(text5, 1, 4);

		gridPane.add(textField3, 0, 5);

		gridPane.add(textField4, 1, 5);

		gridPane.add(text6, 0, 6);

		gridPane.add(text7, 1, 6);

		gridPane.add(passwordField1, 0, 7);

		gridPane.add(passwordField2, 1, 7);	

		gridPane.add(text8, 0, 8);
		
		gridPane.add(datePicker, 0, 9);

		gridPane.add(text9, 1, 8);

		gridPane.add(textField7, 1, 9);

		gridPane.add(text10, 0, 11);

		gridPane.add(male, 0, 12);
		gridPane.add(female, 0, 13);

		gridPane.add(checkBox1, 0, 16);

		gridPane.add(button1, 0, 17);

		gridPane.add(text12, 0, 19);

		gridPane.add(button2, 0, 20);

		


		//button1.setStyle("-fx-background-color: limegreen; -fx-text-fill:Black;	-fx-font-size:25pt;	-fx-min-width: 300;	fx-min-height: 50; -fx-font: normal bold 25px 'serif';"	);

		button1.setStyle("-fx-background-color: inear-gradient(#f2f2f2, #d6d6d6), linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-text-fill: black;  -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
		button2.setStyle("-fx-background-color: linear-gradient(#f0ff35, #a9ff00), radial-gradient(center 50% -40%, radius 200%, #b8ee36 45%, #80c800 50%); -fx-background-radius: 6, 5; -fx-background-insets: 0, 1; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 ); -fx-text-fill: #395306;");
		

		 	


		text1.setStyle("-fx-font: normal bold 15px 'script typeface'");
		text2.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text3.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text4.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text5.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text6.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text7.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text8.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text9.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text10.setStyle("-fx-font: normal bold 13px 'monospace' ");
		text11.setStyle("-fx-font: normal bold 40px 'monospace' ");
		text12.setStyle("-fx-font: normal bold 18px 'script typeface' ");



		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() 
		{ 
         @Override 
         public void handle(MouseEvent e)
          { 
            System.out.println("Thank you for registering for Kaffi's Kitchen Delivery Application"); 
            button1.setStyle("-fx-background-color: blue; -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-text-fill: black;  -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");            
          } 
      	};


      button1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);


		gridPane.setStyle("-fx-background-color: LightSalmon");


		Scene scene = new Scene(gridPane);

		stage.setTitle("Kaffi's Kitchen Delivery");

		stage.getIcons().add(new Image("file:CAT1Image.png"));

		stage.setScene(scene);

		stage.show();
	}
}