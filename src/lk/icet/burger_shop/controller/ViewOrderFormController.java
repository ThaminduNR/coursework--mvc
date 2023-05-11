package lk.icet.burger_shop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewOrderFormController {
    public void getAllCustomersOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Place Order");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/viewAllCustomers.fxml"))));
        stage.centerOnScreen();
        stage.show();


    }

    public void getAllOrdersOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Place Order");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewAllOrders.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void getOrderDetailOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Place Order");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/viewOneOrder.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }
}
