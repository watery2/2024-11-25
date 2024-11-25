package kitm;

import java.util.ArrayList;
import java.util.Comparator;

public class Studentas {
    private String name;
    private String lastname;
    private ArrayList<Dalykas> dalykai = new ArrayList<>();

    public Studentas(String name, String lastname)
    {
        this.name = name;
        this.lastname = lastname;
    }

    public void addDalyka(String name)
    {
        dalykai.add(new Dalykas(name));
    }

    public void addPazymiDalykui(int index, Integer num)
    {
        dalykai.get(index).addPazimi(num);
    }

    public ArrayList<Dalykas> getArray()
    {
        return dalykai;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
