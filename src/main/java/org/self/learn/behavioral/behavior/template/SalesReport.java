package org.self.learn.behavioral.behavior.template;

public class SalesReport extends ReportTemplate{
    @Override
    protected void buildLayout() {
        System.out.println("Layout build for Sales");
    }

    @Override
    protected void fetchData() {
        System.out.println("Data Pulled from the Sales DB");
    }
}
