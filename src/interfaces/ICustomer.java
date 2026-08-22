package interfaces;

import customers.PaymentMethod;
import discount.Discount;

import java.util.ArrayList;

public interface ICustomer {

    String getName();

    PaymentMethod getPaymentMethod();

    ArrayList<Discount> getDiscounts();

}
