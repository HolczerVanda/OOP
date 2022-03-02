package fourtLesson;

public class Alkalmazott {

    String name;
    int salary;


    public void increaseSalary(int extent)
    {
        salary+=extent;
    }

    String concat(String name, int salary)
    {
        String salaryString=Integer.toString(salary);
        String concated=name.concat(salaryString);
        return concated;
    }
}