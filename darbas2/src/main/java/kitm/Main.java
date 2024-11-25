package kitm;

import java.util.*;


public class Main {

    public static void printStud(Studentas studentas)
    {
        ArrayList<Dalykas> dalykai = studentas.getArray();
        dalykai.sort(Comparator.comparing(Dalykas::getName));

        System.out.println("Mokinys: " + studentas.getName() + " " + studentas.getLastname());
        System.out.println("Dalykai");

        for (int i = 0; i < dalykai.size(); i++)
        {
            System.out.println("- " + dalykai.get(i).getName() + ": " + dalykai.get(i).getArray() + " Vidurkis: " + String.format("%.1f", dalykai.get(i).Vidurkis()));
        }
    }

    public static void main(String[] args) {

        Studentas studentas1 = new Studentas("Jonas", "Jonaitis");
        studentas1.addDalyka("Matematika");
        studentas1.addDalyka("Fizika");
        studentas1.addDalyka("Lietuviu kalba");

        studentas1.addPazymiDalykui(0, 9);
        studentas1.addPazymiDalykui(0, 8);
        studentas1.addPazymiDalykui(0, 10);

        studentas1.addPazymiDalykui(1, 7);
        studentas1.addPazymiDalykui(1, 6);
        studentas1.addPazymiDalykui(1, 8);

        studentas1.addPazymiDalykui(2, 10);
        studentas1.addPazymiDalykui(2, 9);
        studentas1.addPazymiDalykui(2, 10);

        printStud(studentas1);

        Studentas studentas2 = new Studentas("Ona", "Petraite");
        studentas2.addDalyka("Anglu kalba");
        studentas2.addDalyka("Biologija");

        studentas2.addPazymiDalykui(0, 10);
        studentas2.addPazymiDalykui(0, 9);
        studentas2.addPazymiDalykui(0, 8);

        studentas2.addPazymiDalykui(1, 6);
        studentas2.addPazymiDalykui(1, 7);
        studentas2.addPazymiDalykui(1, 7);

        printStud(studentas2);
    }
}