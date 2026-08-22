package discount;

import interfaces.IMenuItem;
import shop.Drinks;

import java.util.ArrayList;

public class DiscountConstants {

    private static final double MEMBER_DISCOUNT_PERCENTAGE = 0.1;
    private static final double VIP_DISCOUNT_PERCENTAGE = 0.2;
    private static final double STUDENT_ABSOLUTE_COUPON = 5;
    private static final double WEEKEND_TEA_PERCENTAGE = 0.2;

    public static final Discount MEMBER_DISCOUNT = new Discount(DiscountTypes.PERCENTAGE_DISCOUNT,
            menuItems -> {
                                double discount = 0;
                                for (IMenuItem item : menuItems){
                                    discount += item.getPrice() * DiscountConstants.MEMBER_DISCOUNT_PERCENTAGE;
                                }
                                return discount;
            });
    public static final Discount VIP_DISCOUNT = new Discount(DiscountTypes.PERCENTAGE_DISCOUNT,
            menuItems -> {
                                double discount = 0;
                                for (IMenuItem item : menuItems){
                                    discount += item.getPrice() * DiscountConstants.VIP_DISCOUNT_PERCENTAGE;
                                }
                                return discount;
            });
    public static final Discount STUDENT_COUPON = new Discount(DiscountTypes.ABSOLUTE_DISCOUNT,
            menuItems -> DiscountConstants.STUDENT_ABSOLUTE_COUPON);

    public static final Discount BUY_TWO_GET_ONE_FREE_COFFEE = new Discount(DiscountTypes.ABSOLUTE_DISCOUNT,
            menuItems -> {
                                int coffeeCounter = 0;
                                for (IMenuItem item : menuItems) {
                                    if (item.equals(Drinks.COFFEE)){
                                        coffeeCounter++;
                                    }
                                }
                                int freeCoffees = coffeeCounter / 3;
                                return Drinks.COFFEE.getPrice() * freeCoffees;
            });
    public static final Discount WEEKEND_TEA_DISCOUNT = new Discount(DiscountTypes.PERCENTAGE_DISCOUNT,menuItems -> {
        double discount = 0;

        for (IMenuItem item : menuItems){

            if (item == Drinks.TEA){

                discount += Drinks.TEA.getPrice() * DiscountConstants.WEEKEND_TEA_PERCENTAGE;

            }

        }

        return discount;

    });
}
