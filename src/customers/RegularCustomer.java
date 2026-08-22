package customers;

import discount.DiscountConstants;

public class RegularCustomer extends GenericCustomer{
    public RegularCustomer(String name, PaymentMethod paymentMethod) {
        super(name, paymentMethod);
    }
}
