package org.self.learn.structural.composite;

public class CompositeMainApp {

    public static void main(String[] args) {
        Employee e1 = new Employee(30000,"Nitin");
        Employee e2 = new Employee(40000,"Ankita");

        Manager m1 = new Manager(50000,"Uday (Manager)");
        m1.addSubOrdinates(e1);
        m1.addSubOrdinates(e2);

        Manager m2 = new Manager(60000,"Dipankar (Senior-Manager)");
        m2.addSubOrdinates(m1);

        m2.showDetails();

    }
}
