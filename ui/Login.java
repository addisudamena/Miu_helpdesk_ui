package ui;
	

import javafx.application.Application;
import javafx.stage.Stage;



public class Login extends Application {
	@Override
	public void start(Stage primaryStage) {
	

		primaryStage.setScene(UIColection.loginScene(primaryStage));
		primaryStage.setResizable(false);
		 primaryStage.setTitle("Mahirishi International University Help Desk");
		primaryStage.show();
	
			
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

	
	

	
	
}
