package kitm;

import java.util.ArrayList;

public class Dalykas {
    private String name;
    private ArrayList<Integer> ivertinimai = new ArrayList<>();

    public Dalykas(String name)
    {
        this.name = name;
    }

    public void addPazimi(Integer num)
    {
        this.ivertinimai.add(num);
    }

    public String getArray()
    {
        return ivertinimai.toString();
    }

    public String getName()
    {
        return name;
    }

    public double Vidurkis()
    {
        double sum = 0;

        for (int i = 0; i < ivertinimai.size(); i++)
        {
            sum += ivertinimai.get(i);
        }

        return sum / ivertinimai.size();
    }
}
