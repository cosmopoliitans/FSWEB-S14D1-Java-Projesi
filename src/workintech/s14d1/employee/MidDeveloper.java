package workintech.s14d1.employee;

public class MidDeveloper extends Employee{

    public MidDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Mid Developer named " + getName() + " started to work.");
        setSalary(getSalary() + 7500);
    }
}
