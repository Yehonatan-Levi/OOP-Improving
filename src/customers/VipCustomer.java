package customers;

import discount.DiscountConstants;

public class VipCustomer extends GenericCustomer{
    public VipCustomer (String name, PaymentMethod paymentMethod){
        super(name, paymentMethod);
        addDiscount(DiscountConstants.VIP_DISCOUNT);
    }
}
