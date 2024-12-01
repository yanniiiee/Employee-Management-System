package org.example.employeemanagementsystem;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML
    private TableView<Employee> tableView;
    @FXML
    private TableColumn<Employee, String> nameColumn;
    @FXML
    private TableColumn<Employee, String> typeColumn;
    @FXML
    private TableColumn<Employee, String> salaryColumn;
    @FXML
    private TextField nameField;
    @FXML
    private ComboBox<String> typeDropdown;
    @FXML
    private TextField salaryField;
    @FXML
    private TextField hoursField;

    private final ObservableList<Employee> employees = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize Table Columns
        nameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        typeColumn.setCellValueFactory(cellData -> {
            String type = cellData.getValue().getClass().getSimpleName();
            return new SimpleStringProperty(type.replace("Employee", ""));
        });
        salaryColumn.setCellValueFactory(cellData -> {
            double salary = cellData.getValue().calculateSalary();
            return new SimpleStringProperty(String.format("%.2f", salary));
        });

        // Set table data
        tableView.setItems(employees);
    }

    @FXML
    private void addEmployee() {
        String name = nameField.getText();
        String type = typeDropdown.getValue();
        double rate = Double.parseDouble(salaryField.getText());
        int hours = hoursField.getText().isEmpty() ? 0 : Integer.parseInt(hoursField.getText());

        Employee employee = null;

        if ("FullTime".equals(type)) {
            employee = new FullTimeEmployee(name, rate);
        } else if ("PartTime".equals(type)) {
            employee = new PartTimeEmployee(name, rate, hours);
        } else if ("Contractor".equals(type)) {
            employee = new Contractor(name, rate, hours);
        }

        if (employee != null) {
            employees.add(employee);
            clearFields();
        }
    }
    @FXML
    private void removeEmployee() {
        Employee selectedEmployee = tableView.getSelectionModel().getSelectedItem();

        if (selectedEmployee != null) {
            employees.remove(selectedEmployee);  // Remove the selected employee from the list
        } else {
            // Show an alert if no employee is selected
            showAlert("No Selection", "Please select an employee to remove.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    private void clearFields() {
        nameField.clear();
        salaryField.clear();
        hoursField.clear();
        typeDropdown.setValue(null);
    }
}
