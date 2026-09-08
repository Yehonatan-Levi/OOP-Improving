package client;

import discount.Discounts;

public class Member extends Client{

    public Member(){
        super();
        addDiscount(Discounts.MEMBER_DISCOUNT);
    }
}
