package customers;

import interfaces.ICustomer;
import interfaces.IMenuItem;

import java.util.ArrayList;
import java.util.function.Function;

public abstract class GenericCustomer implements ICustomer {

    private String name;
    private Function<ArrayList<IMenuItem>, Double> discount;
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

    public double getDiscount(ArrayList<IMenuItem> menuItems) {
        return discount.apply(menuItems);
    }

    public void setDiscount(Function<ArrayList<IMenuItem>, Double> discount) {
        this.discount = discount;
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
