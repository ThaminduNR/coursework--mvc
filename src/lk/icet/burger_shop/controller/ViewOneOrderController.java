package lk.icet.burger_shop.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.icet.burger_shop.db.Database;
import lk.icet.burger_shop.model.Order;

public class ViewOneOrderController {
    public TextField txtOrderId;
    public Label ibiCustId;
    public Label ibiCustName;
    public Label lblBurQty;
    public Label ibiBillValue;
    public Label ibiOrderStatus;
    public Label lblCustId;
    public Label lblCustName;
    public Label lblBillValue;
    public Label lblOrderStatus;

    public void loadDataOnAction(ActionEvent actionEvent) {
        String orderId = String.valueOf(txtOrderId.getText());
        System.out.println(orderId);

        try{
            Order orderValues = Database.getOrderValues(orderId);
//            System.out.println(orderValues.toString());
            lblCustId.setText(String.valueOf(orderValues.getCustId()));
            lblCustName.setText(orderValues.getCustName());
            lblBurQty.setText(String.valueOf(orderValues.getBugQty()));
            lblBillValue.setText(String.valueOf(orderValues.getBillValue()));
            lblOrderStatus.setText(orderValues.getStatus());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
