package ui;
	

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.xpath.internal.functions.FuncStartsWith;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class UIColection  {

	

	
	
	public static Scene formScene() {
		
		
		Label label= new Label("Ticket");
		label.setStyle("-fx-font-size:20");
	
		
		Label label1 = new Label("Ticket Id: ");
		label1.setStyle("-fx-font-size:20");
		Label labelb1 = new Label("548744");
		
		Label label2 = new Label("Ticket Id: ");
		label2.setStyle("-fx-font-size:20");
		Label labelb2 = new Label("548744");

		Label label3 = new Label("Title: ");
		label3.setStyle("-fx-font-size:20");
		Label labelb3 = new Label("548744");
		

		Label label4 = new Label("Descriptin: ");
		label3.setStyle("-fx-font-size:20");

		TextArea labelb4=new TextArea("fjkog ksadjfkasd asgjkdojrjdfkjsdgass desadf");
		labelb4.setDisable(true);


		 
		
		
		Separator separator = new Separator(Orientation.HORIZONTAL);
		
		Label label5 = new Label("Assigned TO: ");
		label5.setStyle("-fx-font-size:20");
		Label labelb5 = new Label(" dkasdj ");

		Label label6 = new Label("Assigned By: ");
		label6.setStyle("-fx-font-size:20");
		Label labelb6 = new Label("548744");
		
		

		Label label7 = new Label("Status: ");
		label7.setStyle("-fx-font-size:20");
		Label labelb7 = new Label("548744");
		

		Label label8 = new Label("Solution: ");
		label8.setStyle("-fx-font-size:20");
		
		TextArea labelb8=new TextArea("fjkog ksadjfkasd asgjkdojrjdfkjsdgass desadf");
		labelb8.setDisable(true);

		GridPane gridPane = new GridPane();
		
		gridPane.add(label1, 0, 0, 1, 1);
		gridPane.add(label2, 0, 1, 1, 1);
		gridPane.add(label3, 0, 2, 1, 1);
		
		gridPane.add(labelb1, 1, 0, 1, 1);
		gridPane.add(labelb2, 1, 1, 1, 1);
		gridPane.add(labelb3, 1, 2, 1, 1);
		
		
		gridPane.add(label4, 0, 3, 1, 1);
		gridPane.add(labelb4, 0, 4, 2, 1);
		
		gridPane.add(separator, 0, 5, 1, 1);
		

		gridPane.add(label5, 0, 6, 1, 1);
		gridPane.add(label6, 0, 7, 1, 1);
		gridPane.add(label7, 0, 8, 1, 1);
		gridPane.add(label8, 0, 9, 1, 1);
		
		gridPane.add(labelb5, 1, 6, 1, 1);
		gridPane.add(labelb6, 1, 7, 1, 1);
		gridPane.add(labelb7, 1, 8, 1, 1);
		gridPane.add(labelb8, 0, 10, 2, 1);
		
	
		
	
		Button btn1 = new Button("Close");
		//btn.setOnAction(e -> System.out.println("Click"));

		Button btn2 = new Button("Cancel");
		//btn.setOnAction(e -> System.out.println("Click"));

		HBox buttonBox = new HBox(15);     // sets spacing
		buttonBox.getChildren().addAll(btn1,btn2);
		buttonBox.setAlignment(Pos.TOP_RIGHT);
		
		
		VBox vbox1 = new VBox(15);     // sets spacing
		vbox1.getChildren().addAll(label);
		vbox1.setAlignment(Pos.TOP_LEFT);
		
		
		VBox vbox2 = new VBox(15);     // sets spacing
		vbox2.getChildren().addAll(vbox1, gridPane, buttonBox);
		vbox2.setAlignment(Pos.TOP_RIGHT);
		vbox2.setPadding(new Insets(15));
		
		
		
		
		return new Scene(vbox2);
	}
	
	
	
	
	
	
	public static Scene adminScene() {
		
		
		Label label= new Label("Admin Panal");
		label.setStyle("-fx-font-size:20");
		label.setPadding(new Insets(20));
	
		
		
		
		 TableView<Person> tableView = new TableView<Person>();

		 TableColumn<Person, String> firstNameColumn = new TableColumn<>("Ticket Id");
		 firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
		 
		 TableColumn<Person, String> lastNameColumn = new TableColumn<>("Title");
		 lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		 

		 TableColumn<Person, String> addresColumn = new TableColumn<>("Status");
		 addresColumn.setCellValueFactory(new PropertyValueFactory<>("addres"));
		 

		 TableColumn<Person, String> addresColumn2 = new TableColumn<>("Assigned to");
		 addresColumn.setCellValueFactory(new PropertyValueFactory<>("addres"));
		 

		    tableView.getColumns().add(firstNameColumn);
		    tableView.getColumns().add(lastNameColumn);
		    tableView.getColumns().add(addresColumn);
		    tableView.getColumns().add(addresColumn2);
		 
		 tableView.getItems().add(new Person("John", "Doe","thisdsl"));
		 tableView.getItems().add(new Person("Jane", "Deer","kjaskdgsd"));
		 

		
		Button btn1 = new Button("View Detail");
		Button btn2 = new Button("Assign");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	Stage secondaryStage=new Stage();
            	secondaryStage.setScene(UIColection.formScene());
            	secondaryStage.setResizable(false);
            	secondaryStage.setTitle("MIU help desk");
            	secondaryStage.show();
            	
            	
            	
            	
            }
        });
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	Stage secondaryStage=new Stage();
            	secondaryStage.setScene(UIColection.assignScene());
            	secondaryStage.setResizable(false);
            	secondaryStage.setTitle("MIU help desk");
            	secondaryStage.show();
            	
            	
            	
            	
            }
        });
		
		HBox buttonBox = new HBox(15);     // sets spacing
		buttonBox.getChildren().addAll(btn1,btn2);
		buttonBox.setAlignment(Pos.TOP_RIGHT);
		
	
		
		VBox vbox1 = new VBox(15);     // sets spacing
		vbox1.getChildren().addAll(tableView,buttonBox);
		vbox1.setPadding(new Insets(20));
	
		Button btn3 = new Button("Manage Tickets");
		Button btn4 = new Button("Manage Clients");
		Button btn5 = new Button("Manage Ajents");
		
		VBox vbox2 = new VBox(15);     // sets spacing
		vbox2.setStyle("-fx-background-color: #eeeeee;");
		vbox2.getChildren().addAll(btn3,btn4,btn5);
		vbox2.setPadding(new Insets(20));
		
		HBox finalBox = new HBox(15);     // sets spacing
		finalBox.getChildren().addAll(vbox2,vbox1);
		finalBox.setAlignment(Pos.TOP_RIGHT);
		
		
		VBox vbox3 = new VBox(15);     // sets spacing
		
		vbox3.getChildren().addAll(label, finalBox);
		
		
		return new Scene(vbox3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
public static Scene clientScene() {
		
		
		Label label= new Label("Previous Tickets");
		label.setStyle("-fx-font-size:20");
		// Open tickets
		
		
		
		ListView<HBox> ticketListView= new ListView<HBox>();////
		 TableView<Person> tableView = new TableView<Person>();

		 TableColumn<Person, String> firstNameColumn = new TableColumn<>("Ticet Id");
		 firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
		 
		 TableColumn<Person, String> lastNameColumn = new TableColumn<>("Title`1111111");
		 lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		 

		    tableView.getColumns().add(firstNameColumn);
		    tableView.getColumns().add(lastNameColumn);
		 
		 tableView.getItems().add(new Person("John", "Doe","asdf"));
		 tableView.getItems().add(new Person("Jane", "Deer","asdfd"));
		 
	//	 tableView.setPlaceholder(new Label("No rows to display"));
		 

		/* PropertyValueFactory<Object, Object> factory = new PropertyValueFactory<>("firstName");
		 
		 TableViewSelectionModel<Person> selectionModel = tableView.getSelectionModel();*/
		 
		/*// set selection mode to only 1 row
		 selectionModel.setSelectionMode(SelectionMode.SINGLE);*/
		 
		 //ObservableList<Person> selectedItems = selectionModel.getSelectedItems();
		 
		// selectionModel.clearSelection();
		 
		List<String> l=new ArrayList<String>();
		l.add("one tws");
		l.add("Tne tws");
		l.add("Thne tws");
		l.add("Foune tws");

		for (Iterator<String> iterator = l.iterator(); iterator.hasNext();) {
			HBox i=new HBox(12);
			Label li= new Label(iterator.next());
			HBox i2=new HBox(12);
			Label li2= new Label("on");

			i2.setAlignment(Pos.BASELINE_RIGHT);
			i2.setStyle("-fx-background-color: #0000ff;"+"-fx-width:100%");
			i2.getChildren().addAll(li2);
			
			i.getChildren().addAll(li,i2);
			
			ticketListView.getItems().add(i);
			
		}
		
		
		//HBox finalList=new HBox(tableView);
		
		Button btn1 = new Button("View Detail");
		Button btn2 = new Button("Creat New");
		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	Stage secondaryStage=new Stage();
            	secondaryStage.setScene(UIColection.formScene());
            	secondaryStage.setResizable(false);
            	secondaryStage.setTitle("MIU help desk");
            	secondaryStage.show();
            	
            	
            	
            	
            }
        });
		
		
		
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	Stage secondaryStage=new Stage();
            	secondaryStage.setScene(UIColection.createScene());
            	secondaryStage.setResizable(false);
            	secondaryStage.setTitle("MIU help desk");
            	secondaryStage.show();
            	
            	
            	
            	
            }
        });
		
		HBox buttonBox = new HBox(15);     // sets spacing
		buttonBox.getChildren().addAll(btn1,btn2);
		buttonBox.setAlignment(Pos.TOP_RIGHT);
		
	
		
		VBox vbox1 = new VBox(15);     // sets spacing
		vbox1.getChildren().addAll(label,tableView,buttonBox);
		vbox1.setPadding(new Insets(20));
	
		
	
		
		
		
		return new Scene(vbox1, 400, 600);
	}
	
	
	
public static Scene ajentScene() {
	
	
	Label label= new Label("Assigned Tickets");
	label.setStyle("-fx-font-size:20");
	// Open tickets
	
	
	
	ListView<HBox> ticketListView= new ListView<HBox>();////
	 TableView<Person> tableView = new TableView<Person>();

	 TableColumn<Person, String> firstNameColumn = new TableColumn<>("Ticet Id");
	 firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
	 
	 TableColumn<Person, String> lastNameColumn = new TableColumn<>("Title`1111111");
	 lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
	 

	    tableView.getColumns().add(firstNameColumn);
	    tableView.getColumns().add(lastNameColumn);
	 
	 tableView.getItems().add(new Person("John", "Doe","asdf"));
	 tableView.getItems().add(new Person("Jane", "Deer","asdfd"));
	 
//	 tableView.setPlaceholder(new Label("No rows to display"));
	 

	/* PropertyValueFactory<Object, Object> factory = new PropertyValueFactory<>("firstName");
	 
	 TableViewSelectionModel<Person> selectionModel = tableView.getSelectionModel();*/
	 
	/*// set selection mode to only 1 row
	 selectionModel.setSelectionMode(SelectionMode.SINGLE);*/
	 
	 //ObservableList<Person> selectedItems = selectionModel.getSelectedItems();
	 
	// selectionModel.clearSelection();
	 
	List<String> l=new ArrayList<String>();
	l.add("one tws");
	l.add("Tne tws");
	l.add("Thne tws");
	l.add("Foune tws");

	for (Iterator<String> iterator = l.iterator(); iterator.hasNext();) {
		HBox i=new HBox(12);
		Label li= new Label(iterator.next());
		HBox i2=new HBox(12);
		Label li2= new Label("on");

		i2.setAlignment(Pos.BASELINE_RIGHT);
		i2.setStyle("-fx-background-color: #0000ff;"+"-fx-width:100%");
		i2.getChildren().addAll(li2);
		
		i.getChildren().addAll(li,i2);
		
		ticketListView.getItems().add(i);
		
	}
	
	
	//HBox finalList=new HBox(tableView);
	
	Button btn1 = new Button("View Detail");
	Button btn2 = new Button("Solve");
	
	btn1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        	Stage secondaryStage=new Stage();
        	secondaryStage.setScene(UIColection.formScene());
        	secondaryStage.setResizable(false);
        	secondaryStage.setTitle("MIU help desk");
        	secondaryStage.show();
        	
        	
        	
        	
        }
    });
	
	btn2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        	Stage secondaryStage=new Stage();
        	secondaryStage.setScene(UIColection.solutionScene());
        	secondaryStage.setResizable(false);
        	secondaryStage.setTitle("MIU help desk");
        	secondaryStage.show();
        	
        	
        	
        	
        }
    });
	
	HBox buttonBox = new HBox(15);     // sets spacing
	buttonBox.getChildren().addAll(btn1,btn2);
	buttonBox.setAlignment(Pos.TOP_RIGHT);
	

	
	VBox vbox1 = new VBox(15);     // sets spacing
	vbox1.getChildren().addAll(label,tableView,buttonBox);
	vbox1.setPadding(new Insets(20));

	

	
	
	
	return new Scene(vbox1, 400, 600);
}




	
	

	
	public static Scene solutionScene() {
		
		
		Label label= new Label("Solution");
		label.setStyle("-fx-font-size:20");
	
		
		
		
		TextArea textarea=new TextArea();


		 
	
		
		Button btn1 = new Button("Solve");
		Button btn2 = new Button("Calncel");
		
		HBox buttonBox = new HBox(15);     // sets spacing
		buttonBox.getChildren().addAll(btn1,btn2);
		buttonBox.setAlignment(Pos.TOP_RIGHT);
		
	
		
		VBox vbox1 = new VBox(15);     // sets spacing
		vbox1.getChildren().addAll(label,textarea,buttonBox);
		vbox1.setPadding(new Insets(20));
	
		
	
		
		
		
		return new Scene(vbox1);
	}
	

	
	public static Scene createScene() {
		
		
		Label label= new Label("Create Ticke");
		label.setStyle("-fx-font-size:20");
	
		
		
		TextField textField= new TextField("Title");
		TextArea textarea=new TextArea("Description");


		 
	
		
		Button btn1 = new Button("Solve");
		Button btn2 = new Button("Calncel");
		
		HBox buttonBox = new HBox(15);     // sets spacing
		buttonBox.getChildren().addAll(btn1,btn2);
		buttonBox.setAlignment(Pos.TOP_RIGHT);
		
	
		
		VBox vbox1 = new VBox(15);     // sets spacing
		vbox1.getChildren().addAll(label,textField,textarea,buttonBox);
		vbox1.setPadding(new Insets(20));
	
		
	
		
		
		
		return new Scene(vbox1);
	}
	
	
	
	
	
	
	

	

	public static Scene loginScene(Stage secondaryStage) {
		
		
	
		
		Label label= new Label("Log in");
		label.setStyle("-fx-font-size:20");
	
		
		TextField txtInput = new TextField("User Name");
		
		PasswordField pasInput= new PasswordField();
		Button btn = new Button("Log in");
		btn.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	
	            	switch(txtInput.getText()) {
	            	case "c":secondaryStage.setScene(UIColection.clientScene());break;
	            	case "aj":secondaryStage.setScene(UIColection.ajentScene());break;
	            	case "ad":secondaryStage.setScene(UIColection.adminScene());break;
	            	default:System.out.println("wrong");
	            	}
	            	
	            	secondaryStage.setResizable(false);
	            	secondaryStage.setTitle("MIU help desk");
	            	secondaryStage.show();
	            	
	            	
	            	
	            	
	            }
	        });
		VBox vbox1 = new VBox(15);     // sets spacing
		vbox1.getChildren().addAll(label);
		vbox1.setAlignment(Pos.TOP_LEFT);
		vbox1.setPadding(new Insets(15));
		
		
		VBox vbox2 = new VBox(15);     // sets spacing
		vbox2.getChildren().addAll(vbox1,txtInput, pasInput, btn);
		vbox2.setAlignment(Pos.TOP_RIGHT);
		vbox2.setPadding(new Insets(15));
		
		
		
		
		return new Scene(vbox2);
	}
	
	
	

	








	public static Scene assignScene() {
		
		
	
		
		Label label= new Label("Assign ticket");
		label.setStyle("-fx-font-size:20");
	
	
		Label labeld= new Label("Department");
		 ComboBox<String> comboBox = new ComboBox<String>();

	        comboBox.getItems().add("Choice 1");
	        comboBox.getItems().add("Choice 2");
	        comboBox.getItems().add("Choice 3");
	        
	        
	        ListView<String> listView = new ListView<String>();

	        listView.getItems().add("Item 1");
	        listView.getItems().add("Item 2");
	        listView.getItems().add("Item 3");

	    	HBox departmentbox = new HBox(15);     // sets spacing
	    	departmentbox.getChildren().addAll(labeld,comboBox);
	    	departmentbox.setAlignment(Pos.TOP_RIGHT);
			
			
		//btn1.setOnAction(e -> System.out.println("Click"));
		
		
		Button btn1 = new Button("Assign");
		Button btn2 = new Button("Calncel");
		
		HBox buttonBox = new HBox(15);     // sets spacing
		buttonBox.getChildren().addAll(btn1,btn2);
		buttonBox.setAlignment(Pos.TOP_RIGHT);
		
		VBox vbox1 = new VBox(15);     // sets spacing
		vbox1.getChildren().addAll(label,departmentbox);
		vbox1.setAlignment(Pos.TOP_LEFT);
		vbox1.setPadding(new Insets(15));
		
		
		VBox vbox2 = new VBox(15);     // sets spacing
		vbox2.getChildren().addAll(vbox1, listView, buttonBox);
		vbox2.setAlignment(Pos.TOP_RIGHT);
		vbox2.setPadding(new Insets(15));
		
		
		
		
		return new Scene(vbox2,400,300);
	}
	
	

	
	
}
