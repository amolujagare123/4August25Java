package FinalNStatic;

public /*final*/ class Employee {

    int salary = 45000;
    void empWork()
    {
        System.out.println("empWork");
    }

    final void programmerWork()
    {
        System.out.println("programmerWork for employee");
    }

}

class Programmer extends Employee
{
    int bonus = 20000;


 /*   void programmerWork()
    {
        System.out.println("programmerWork");
    }*/


    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();
        System.out.println(p.salary);
        p.empWork();
    }
}
