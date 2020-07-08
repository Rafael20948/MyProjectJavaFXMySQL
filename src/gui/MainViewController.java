package gui;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemNovaVenda;
	
	@FXML
	private MenuItem menuItemAlterarVenda;
	
	@FXML
	private MenuItem menuItemCancelarVenda;
	
	@FXML
	private MenuItem menuItemSair;
	
	@FXML 
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemNovaVendaAction() {
		System.out.println("onMenuItemNovaVendaAction");
	}
	
	@FXML
	public void onMenuItemAlterarAction() {
		System.out.println("onMenuItemAlterarAction");
	}
	
	@FXML
	public void onMenuItemCancelarVendaAction() {
		System.out.println("onMenuItemCancelarVendaAction");
	}
	
	@FXML
	public void onMenuItemSairAction() {
		System.out.println("onMenuItemSairAction");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("onMenuItemSobreAction");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}


}
