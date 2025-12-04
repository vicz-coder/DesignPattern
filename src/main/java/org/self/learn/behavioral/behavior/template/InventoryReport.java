package org.self.learn.behavioral.behavior.template;

public class InventoryReport extends ReportTemplate{
    @Override
    protected void buildLayout() {
        System.out.println("Layout build for Inventory");
    }

    @Override
    protected void fetchData() {
        System.out.println("Data Pulled from the Inventory DB");
    }
}
