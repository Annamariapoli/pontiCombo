package application;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import bean.Citta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class SampleController {
	
	private Model model = new Model();
	
	public void setModel(Model model){
		this.model = model;
//		List<String > city = new LinkedList<String>();
//		city = model.getCity();
//		comboCitta1.getItems().addAll(city.toString());

		   
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Citta> comboCitta1;

    @FXML
    private ComboBox<Citta> comboCitta2;

    @FXML
    private Button btncerca;

    @FXML
    private TextArea txtResult;

    @FXML
    void doCerca(ActionEvent event) {
    	

    }

    @FXML
    void initialize() {
        assert comboCitta1 != null : "fx:id=\"comboCitta1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert comboCitta2 != null : "fx:id=\"comboCitta2\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btncerca != null : "fx:id=\"btncerca\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Sample.fxml'.";

        comboCitta1.getItems().add((Citta) model.getCity());
        comboCitta2.getItems().add((Citta) model.getCity());
    }
}
