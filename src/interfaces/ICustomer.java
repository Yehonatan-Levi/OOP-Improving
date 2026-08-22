package interfaces;

import customers.PaymentMethod;

import java.util.ArrayList;

import java.util.function.Function;

public interface ICustomer {

    String getName();

    PaymentMethod getPaymentMethod();

    double getDiscount(ArrayList<IMenuItem> menuItems);

}
