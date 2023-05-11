package lk.icet.burger_shop.db;

import lk.icet.burger_shop.model.Customer;
import lk.icet.burger_shop.model.Order;

public class Database {

    public static Customer[] customerArray = new Customer[0];
    public static Order[] orderArray = new Order[0];

    public static Customer[] customerIncrement( Customer customer){
        try {
            Customer[] temp = new Customer[customerArray.length + 1];
            for (int i = 0; i < customerArray.length; i++) {
                temp[i] = customerArray[i];
            }

            customerArray = temp;
            customerArray[customerArray.length - 1] = customer;
            return customerArray;
        }catch (Exception e){
            e.printStackTrace();
        }return null;
    }

    public static Order[] orderIncrement(Order order) {
        try{
            Order[] temp = new Order[orderArray.length + 1];
            for (int i = 0; i < orderArray.length; i++) {
                temp[i] = orderArray[i];
            }
            orderArray = temp;
            orderArray[orderArray.length - 1] = order;
            return orderArray;
        }catch(Exception e){
            e.printStackTrace();
        }
return null;

    }

    public static Order getOrderValues(String id) {
        for (Order o:orderArray) {
            if (o.getOrderId().equalsIgnoreCase(id)){
                return o;
            }
        }
        return null;
    }
    public static int getIndexNumber(String id){
        for (int i = 0; i <orderArray.length; i++) {
            if (orderArray[i].getOrderId().equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }

}
