package discount;

import interfaces.IMenuItem;

import java.util.ArrayList;

public class DiscountHandler {

    private ArrayList<Discount> discounts;


    public DiscountHandler(ArrayList<Discount> customerDiscounts, ArrayList<Discount> shopPromotions){
        ArrayList<Discount> temporaryAbsoluteDiscounts = new ArrayList<>();
        this.discounts = new ArrayList<>();

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
        double totalDiscounts = 0;
        for (Discount discount : this.discounts){
            totalDiscounts += discount.getDiscountFunction().apply(menuItems);
        }
        return totalDiscounts;
    }

}
