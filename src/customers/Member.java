package customers;

import discount.DiscountConstants;

public class Member extends GenericCustomer{
    public Member(String name, PaymentMethod paymentMethod){
        super(name, paymentMethod);
        addDiscount(DiscountConstants.MEMBER_DISCOUNT);
    }
}
