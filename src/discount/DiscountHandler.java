package discount;

import interfaces.IMenuItem;

import java.util.ArrayList;

public class DiscountHandler {

    private ArrayList<Discount> discounts;


    public DiscountHandler(ArrayList<Discount> customerDiscounts, ArrayList<Discount> shopPromotions){
        ArrayList<Discount> temporaryAbsoluteDiscounts = new ArrayList<>();
        for (Discount discount : customerDiscounts){
            if (discount.getDiscountType().equals(DiscountTypes.PERCENTAGE_DISCOUNT)) {
                this.discounts.add(discount);
            }
            else {
                temporaryAbsoluteDiscounts.add(discount);
            }
        }
        for (Discount discount : shopPromotions){
            if (discount.getDiscountType().equals(DiscountTypes.PERCENTAGE_DISCOUNT)) {
                this.discounts.add(discount);
            }
            else {
                temporaryAbsoluteDiscounts.add(discount);
            }
        }
        this.discounts.addAll(temporaryAbsoluteDiscounts);
    }

    public double getDiscount(ArrayList<IMenuItem> menuItems){
        double discount = 0;
        for (Discount absoluteDiscount : this.discounts){
            discount += absoluteDiscount.getDiscountFunction().apply(menuItems);
        }
        return discount;
    }

}
