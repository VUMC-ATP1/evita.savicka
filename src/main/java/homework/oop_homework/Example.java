package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

        Customer customer = new Customer("Evita");
        customer.setMember(true);
        customer.setMemberType("Premium");

        Visit customerVisit = new Visit(customer, new Date());
        customerVisit.setProductExpense(7);
        customerVisit.setServiceExpense(15);
        System.out.println(customerVisit.getTotalExpenses());

        Customer customer1 = new Customer("Evelīna");
        customer.setMember(true);
        customer.setMemberType("Gold");

        Visit customerVisit1 = new Visit(customer1, new Date());
        customerVisit1.setServiceExpense(15);
        System.out.println(customerVisit1.getTotalExpenses());

        Customer customer2 = new Customer("Elīna");
        customer.setMember(true);
        customer.setMemberType("Silver");

        Visit customerVisit2 = new Visit(customer, new Date());
        customerVisit2.setProductExpense(7);
        System.out.println(customerVisit2.getTotalExpenses());

        Customer customer3 = new Customer("Līga");
        customer.setMember(false);
        customer.setMemberType("Default");

        Visit customerVisit3 = new Visit(customer, new Date());
        customerVisit3.setProductExpense(7);
        customerVisit3.setServiceExpense(15);
        System.out.println(customerVisit3.getTotalExpenses());
    }
}

