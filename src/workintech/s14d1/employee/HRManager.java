package workintech.s14d1.employee;

import workintech.s14d1.employee.Employee;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper;

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDeveloper,
                     MidDeveloper[] midDeveloper, SeniorDeveloper[] seniorDeveloper){
        super(id, name, salary);
        this.juniorDeveloper = juniorDeveloper;
        this.midDeveloper = midDeveloper;
        this.seniorDeveloper = seniorDeveloper;
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try{
            if(juniorDeveloper[index] == null){
                juniorDeveloper[index] = developer;
            } else {
                System.out.println("Index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found " + ex.getMessage());
        }

    }

    public void addEmployee(int index, MidDeveloper developer) {
        try{
            if(midDeveloper[index] == null){
                midDeveloper[index] = developer;
            } else {
                System.out.println("Index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found " + ex.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try{
            if(seniorDeveloper[index] == null){
                seniorDeveloper[index] = developer;
            } else {
                System.out.println("Index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found " + ex.getMessage());
        }
    }

    public JuniorDeveloper[] getJuniorDeveloper() {
        return juniorDeveloper;
    }

    public MidDeveloper[] getMidDeveloper() {
        return midDeveloper;
    }

    public SeniorDeveloper[] getSeniorDeveloper() {
        return seniorDeveloper;
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName() + " HR Manager begins to work.");
    }
}
