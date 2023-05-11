package lk.icet.burger_shop.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.icet.burger_shop.db.Database;
import lk.icet.burger_shop.model.Customer;
import lk.icet.burger_shop.model.Order;

public class ViewAllOrdersController {
    public TableView tblOrders;
    public TableColumn colOId;
    public TableColumn colCustID;
    public TableColumn colqty;
    public TableColumn colOStatus;

    public void initialize(){
        loadAllOrders();
        setValueFactory();
    }
    public void loadAllOrders(){
        ObservableList<Order> orderList = FXCollections.observableArrayList(Database.orderArray);
        tblOrders.setItems(orderList);
    }

    private void setValueFactory(){
        colOId.setCellValueFactory(new PropertyValueFactory<>("OrderId"));
        colCustID.setCellValueFactory(new PropertyValueFactory<>("CustId"));
        colqty.setCellValueFactory(new PropertyValueFactory<>("bugQty"));
        colOStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

    }
}
