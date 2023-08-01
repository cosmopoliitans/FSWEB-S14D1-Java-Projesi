package workintech.s14d1.employee;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer named " + getName() + " started to work.");
        setSalary(getSalary() + 12000);
    }
}
