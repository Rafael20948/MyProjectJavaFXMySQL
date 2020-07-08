package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

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
		loadView("/gui/Sobre.fxml");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());

		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}

}
