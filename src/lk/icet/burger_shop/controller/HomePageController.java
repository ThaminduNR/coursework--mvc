package lk.icet.burger_shop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {
    public void addNewCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CustomerForm.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void placeOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Place Order");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/PlaceOrderForm.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void updateOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Place Order");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UpdateOrderForm.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void viewOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Place Order");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewOrderForm.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void exitOnAction(ActionEvent actionEvent) {

    }
}
