package org.self.learn.behavioral.behavior.template;

public abstract class ReportTemplate {
    //Define fixed steps to generate report
    public final void generateReport(){
        fetchData();    //Vary
        cleanData();
        buildLayout();  //Vary
        exportLayout();
    }
    protected abstract void buildLayout();
    protected abstract void fetchData() ;

    protected void exportLayout() {
        System.out.println("Exporting the report As PDF");
    }

    protected void cleanData() {
        System.out.println("Formatting data to standard form.");
    }

}
