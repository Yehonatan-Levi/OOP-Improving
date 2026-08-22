package customers;

public enum PaymentMethod {

    CREDIT_CARD("using credit card"),
    CASH("in cash"),
    GIFT_CARD("using gift card");

    private final String usage_message;

    PaymentMethod(String usage_message){
        this.usage_message = usage_message;
    }

    public String getUsage_message(){
        return this.usage_message;
    }

}
