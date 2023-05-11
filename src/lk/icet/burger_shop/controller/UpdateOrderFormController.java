package lk.icet.burger_shop.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import lk.icet.burger_shop.db.Database;
import lk.icet.burger_shop.model.Order;

public class UpdateOrderFormController {
    private static Order order = null;
    public TextField txtCustId;
    public TextField txtCustName;
    public TextField txtBugQty;
    public TextField txtValue;
    public ComboBox cmbOId;
    public ComboBox cmbStatus;

    public void initialize(){
        setOrderId();


        ObservableList<String> pp = FXCollections.observableArrayList("Preparing", "Delivered","Cancel");
        cmbStatus.setItems(pp);
    }

    public void setOrderId(){
        ObservableList<String> ob = FXCollections.observableArrayList();
        Order[] orderArray = Database.orderArray;
        for (Order o: orderArray) {
            ob.add(o.getOrderId());
        }
        cmbOId.setItems(ob);
    }

    public void placeOrderOnAction(ActionEvent actionEvent) {
        int qty = Integer.parseInt(txtBugQty.getText());
        String status = cmbStatus.getValue().toString();
        order.setBugQty(qty);
        order.setStatus(status);

        int indexNumber = Database.getIndexNumber(order.getOrderId());
        try{
            Database.orderArray[indexNumber]=order;
            new Alert(Alert.AlertType.INFORMATION,"Update Success").show();
        }catch (Exception e){
            e.printStackTrace();
            new Alert(Alert.AlertType.INFORMATION,"Update Failed").show();
        }


    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }

    public void backtoHomeOnAction(ActionEvent actionEvent) {
    }

    public void selectId(ActionEvent actionEvent) {
        String id = (String) cmbOId.getValue();
        order = Database.getOrderValues(id);
        txtCustId.setText(String.valueOf(order.getCustId()));
        txtCustName.setText(order.getCustName());
        txtBugQty.setText(String.valueOf(order.getBugQty()));
        txtValue.setText(String.valueOf(order.getBillValue()));
        cmbStatus.setValue(order.getStatus());




    }
}
