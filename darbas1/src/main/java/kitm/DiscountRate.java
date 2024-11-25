package kitm;

public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver= 0.1;

    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type)
    {
        if (type.equals("Premium"))
        {
            return serviceDiscountPremium;
        }
        else if (type.equals("Gold"))
        {
            return serviceDiscountGold;
        }
        else if (type.equals("Silver"))
        {
            return serviceDiscountSilver;
        }

        return 0;
    }

    public static double getProductDiscountRate(String type)
    {

        if(type.equals("Premium"))
        {
            return productDiscountPremium;
        }
        else if(type.equals("Gold"))
        {
            return productDiscountGold;
        }
        else if(type.equals("Silver"))
        {
            return productDiscountSilver;
        }

        return 0;
    }
}
