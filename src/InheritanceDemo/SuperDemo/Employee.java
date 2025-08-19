package InheritanceDemo.SuperDemo;

public class Employee {

  /*  Employee()
    {
        System.out.println("inside employee constructor");
    }*/

    Employee(int id)
    {
        System.out.println("inside employee constructor : id="+id);
    }
    int salary = 45000;
    int bonus = 5000;
    void empWork()
    {
        System.out.println("empWork");
    }
    void programmerWork()
    {
        System.out.println("programmer Work from employee");
    }
}

class Programmer extends Employee
{


    int bonus = 20000;

    @Override
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    Programmer()
    {
        super(45);
        System.out.println("inside programmer constructor");
    }

    void display()
    {
        System.out.println("salary="+salary);
        empWork();
        System.out.println("bonus="+bonus);
        programmerWork();

        System.out.println("bonus="+super.bonus);
        super.programmerWork();

    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
        /*System.out.println(p.bonus);
        p.programmerWork();
        System.out.println(p.salary);
        p.empWork();*/

    //    p.display();

        Employee e = new Programmer();
        e.programmerWork();
    }
}
