package lk.ijse.javafx.controller;

/*
    @author DanujaV
    @created 9/26/23 - 10:12 AM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane rootNode;

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Customer Form");

        stage.show();
    }

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Item Form");
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) {
        System.out.println("supplier button pressed!");
    }
}
