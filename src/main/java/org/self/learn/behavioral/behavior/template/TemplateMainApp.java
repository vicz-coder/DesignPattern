package org.self.learn.behavioral.behavior.template;

public class TemplateMainApp {
    public static void main(String[] args) {
        SalesReport salesReport = new SalesReport();
        salesReport.generateReport();

        InventoryReport inventoryReport = new InventoryReport();
        inventoryReport.generateReport();
    }
}
