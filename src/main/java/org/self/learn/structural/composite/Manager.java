package org.self.learn.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements OrganizationalComponent{

    double mgrSalary;
    String mgrName;

    public List<OrganizationalComponent> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<OrganizationalComponent> subordinates) {
        this.subordinates = subordinates;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public double getMgrSalary() {
        return mgrSalary;
    }

    public void setMgrSalary(double mgrSalary) {
        this.mgrSalary = mgrSalary;
    }

    private List<OrganizationalComponent> subordinates = new ArrayList<>();

    public Manager(double mgrSalary, String mgrName) {
        this.mgrSalary = mgrSalary;
        this.mgrName = mgrName;
    }


    public void addSubOrdinates(OrganizationalComponent subord){
        this.subordinates.add(subord);
    }

    public void removeSubOrdinates(OrganizationalComponent subord){
        this.subordinates.remove(subord);
    }

    @Override
    public String getName() {
        return this.getMgrName();
    }

    @Override
    public double getSalary() {
        return this.getMgrSalary();
    }

    @Override
    public void showDetails() {
        System.out.println("Manager ::"+this.getMgrName()+" | Salary ::"+this.getMgrSalary());
        for (OrganizationalComponent oc : subordinates){
            oc.showDetails();
        }
    }
}
