package kitm;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Tomas");
        customer1.setMember(true);
        customer1.setMemberType("Gold");

        Date date = new Date();

        Visit visit1 = new Visit(customer1, date);

        visit1.setServiceExpense(500);
        visit1.setProductExpense(800);
        System.out.println(visit1.getTotalExpense());

        System.out.println(visit1);

    }
}