package shop;

import discount.Discount;
import discount.DiscountConstants;

import java.util.ArrayList;
import java.util.List;

public class ShopConstants {
    static final ArrayList<Discount> ACTIVE_STORE_DISCOUNTS = new ArrayList<>(List.of(
        DiscountConstants.WEEKEND_TEA_DISCOUNT,
        DiscountConstants.BUY_TWO_GET_ONE_FREE_COFFEE
    ));
}
