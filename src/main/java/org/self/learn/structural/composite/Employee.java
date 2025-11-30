package org.self.learn.structural.composite;

public class Employee implements OrganizationalComponent{

    double empSalary;
    String empName;

    public Employee(double empSalary, String empName) {
        this.empSalary = empSalary;
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String getName() {
        return getEmpName();
    }

    @Override
    public double getSalary() {
        return getEmpSalary();
    }

    @Override
    public void showDetails() {
        System.out.println("Employee ::"+this.getEmpName()+" | Salary ::"+this.getEmpSalary());
    }
}
