package customers;

import interfaces.ICustomer;
import interfaces.IMenuItem;

import java.util.function.Function;

public abstract class GenericCustomer implements ICustomer {

    private String name;
    private Function<IMenuItem, Double> discount;

    public GenericCustomer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Function<IMenuItem, Double> getDiscount() {
        return discount;
    }

    public void setDiscount(Function<IMenuItem, Double> discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer name: " + this.name;
    }
}
