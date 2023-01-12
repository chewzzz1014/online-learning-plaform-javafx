package application;
import java.io.*;
import javafx.control.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controllers implements Initializable{
	
	private ChoiceBox <String> myChoiceBox;
	
	private String[] paymethod = {"Tng E-Wallet","GrabPay","CimbClicks"};
	
	public void initialize(URL argo0, ResourceBundle arg1) {
		
		myChoiceBox.getItems().addAll(paymethod);
	}
}
