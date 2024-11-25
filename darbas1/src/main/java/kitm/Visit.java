package kitm;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date)
    {
        this.customer = customer;
        this.date = date;
    }

    public String getName()
    {
        return customer.getName();
    }

    public double getServiceExpense()
    {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense)
    {
        if (customer.isMember())
        {
            this.serviceExpense = serviceExpense - serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
        }
        else{
            this.serviceExpense = serviceExpense;
        }
    }

    public double getProductExpense()
    {
        return productExpense;
    }

    public void setProductExpense(double productExpense)
    {

        if(customer.isMember())
        {
            this.productExpense = productExpense - productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType());
        }
        else
        {
            this.productExpense = productExpense;
        }
    }

    public double getTotalExpense()
    {
        return serviceExpense + productExpense;
    }

    @Override
    public String toString()
    {
        return customer.toString() + " ServiceExpense: " + serviceExpense + " ProductExpense: " + productExpense + " Date: " + date;
    }
}
