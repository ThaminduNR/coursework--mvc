package lk.icet.burger_shop.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.icet.burger_shop.db.Database;
import lk.icet.burger_shop.model.Customer;


public class ViewAllCustomersControllers {
    public TableView tblCustomer;
    public TableColumn colCustId;
    public TableColumn colName;
    public TableColumn coltotal;

    public void initialize(){
        loadCustomerData();
        setValueFactory();
    }

    public void loadCustomerData(){
        ObservableList<Customer> custList = FXCollections.observableArrayList(Database.customerArray);
        tblCustomer.setItems(custList);

    }

    private void setValueFactory(){
        colCustId.setCellValueFactory(new PropertyValueFactory<>("CustomerId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("CustomerName"));
        coltotal.setCellValueFactory(new PropertyValueFactory<>("total"));

    }
}
