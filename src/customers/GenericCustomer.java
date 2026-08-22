package customers;

import discount.Discount;
import interfaces.ICustomer;

import java.util.ArrayList;

public abstract class GenericCustomer implements ICustomer {

    private String name;
    private ArrayList<Discount> discounts;
    private PaymentMethod paymentMethod;

    public GenericCustomer(String name, PaymentMethod paymentMethod){
        this.name = name;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Discount> getDiscounts() {
        return this.discounts;
    }

    public void addDiscount(Discount discount){
        this.discounts.add(discount);
    }

    public void addDiscounts(ArrayList<Discount> discounts){
        this.discounts.addAll(discounts);
    }

    public void setDiscounts(ArrayList<Discount> discounts) {
        this.discounts = discounts;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Customer name: " + this.name;
    }
}
