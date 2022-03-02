package fourtLesson;

public class Alkalmazott2 {

    private String name;
    private int salary;

    Alkalmazott2(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }


    public void increaseSalary(int extent)
    {
        salary+=extent;
    }

    public String concat()
    {
        return name + " " + salary;
    }


    public String getName()
    {
        return this.name;
    }

    public Integer getSalary()
    {
        return this.salary;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setSalary(int salary)
    {
        this.salary=salary;
    }


    public boolean isBetween(int min, int max)
    {
        if(salary>min && salary<max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public double taxCalculator(int salary)
    {
        double tax=(double)salary*0.16;
        return tax;
    }

    public boolean isGreaterThan(int anotherSalary)
    {
        if(salary>anotherSalary)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}