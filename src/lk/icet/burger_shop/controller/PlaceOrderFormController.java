package lk.icet.burger_shop.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import lk.icet.burger_shop.db.Database;
import lk.icet.burger_shop.model.Customer;
import lk.icet.burger_shop.model.Order;

public class PlaceOrderFormController {
    public TextField txtBugQty;
    public TextField txtValue;
    public TextField txtCustId;
    public TextField txtCustName;
    public AnchorPane placeOrderPane;

    public Label lblOrderId;

    public void initialize(){
        setOrderID();
    }

    public void placeOrderOnAction(ActionEvent actionEvent) {
        int custId= Integer.parseInt(txtCustId.getText());
        String CustName = txtCustName.getText();



        String oId = lblOrderId.getText();
        int bQty = Integer.parseInt(txtBugQty.getText());
        String status = "Preparing";
        double value = Double.parseDouble(txtValue.getText());

        Customer customer = new Customer(custId,CustName,value);
        Order order = new Order(oId,custId,CustName,bQty,status,value);

        boolean custSave = Database.customerIncrement(customer) != null;
        boolean OrderSave = Database.orderIncrement(order) != null;

        if (custSave && OrderSave){
            new Alert(Alert.AlertType.INFORMATION,"Order Successful...").show();
            clearText();
            setOrderID();;
        }else{
            new Alert(Alert.AlertType.INFORMATION,"Order Failed...").show();
        }


    }

    public void cancelOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) placeOrderPane.getScene().getWindow();
        stage.close();

    }

    public void backtoHomeOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) placeOrderPane.getScene().getWindow();
        stage.close();
    }

    public void setOrderID() {
        if (Database.orderArray.length<1) {
            lblOrderId.setText("B-0001");
            return;
        }
        String tempId = Database.orderArray[Database.orderArray.length - 1].getOrderId();
        String array[] = tempId.split("-");
        int tempNum = Integer.parseInt(array[1]);
        int Id = tempNum + 1;
        lblOrderId.setText("B-000" + Id);
    }

    private void clearText(){
        txtCustId.clear();
        txtCustName.clear();
        txtBugQty.clear();
        txtValue.clear();
    }
}
