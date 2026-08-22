package customers;

import interfaces.IMenuItem;

public class RegularCustomer extends GenericCustomer{
    public RegularCustomer(String name, PaymentMethod paymentMethod) {
        super(name, paymentMethod);
        setDiscount(menuItems -> CustomersConstants.REGULAR_DISCOUNT);
    }
}
