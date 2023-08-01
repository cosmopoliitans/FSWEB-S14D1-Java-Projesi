package workintech.s14d1.employee;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work() {
       setSalary(25000);
        System.out.println("Junior Developer named " + getName() + " started to work.");
    }
}
