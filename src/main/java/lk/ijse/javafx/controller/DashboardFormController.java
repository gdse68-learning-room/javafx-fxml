package lk.ijse.javafx.controller;

/*
    @author DanujaV
    @created 9/26/23 - 10:12 AM   
*/

import javafx.event.ActionEvent;

public class DashboardFormController {
    public void btnCustomerOnAction(ActionEvent actionEvent) {
        System.out.println("customer button pressed!");
    }

    public void btnItemOnAction(ActionEvent actionEvent) {
        System.out.println("item button pressed!");
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) {
        System.out.println("supplier button pressed!");
    }
}
