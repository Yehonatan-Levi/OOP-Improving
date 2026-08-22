package customers;

import interfaces.IMenuItem;

public class Member extends GenericCustomer{
    public Member(String name, PaymentMethod paymentMethod){
        super(name, paymentMethod);
        setDiscount((menuItems) -> {
            double discount = 0;
            for (IMenuItem menuItem : menuItems){
                discount += menuItem.getPrice() * CustomersConstants.MEMBER_DISCOUNT_PERCENTAGE;
            }
            return discount;
        });
    }
}
