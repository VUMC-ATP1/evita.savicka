package homework.oop_homework;

import lombok.ToString;

import java.util.Date;

@ToString
public class Visit {

    public Customer customer;
    public Date date;
    public double serviceExpense;
    public double ProductExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return ProductExpense;
    }

    public void setProductExpense(double productExpense) {
        ProductExpense = productExpense;
    }

    public double getTotalExpenses() {
        return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType())) + (ProductExpense - (ProductExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()))));
    }
}
