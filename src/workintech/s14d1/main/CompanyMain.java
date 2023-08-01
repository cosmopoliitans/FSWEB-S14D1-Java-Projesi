package workintech.s14d1.main;

import workintech.s14d1.employee.*;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {

        Employee asci = new Employee(8, "Zübeyde", 20000);
        asci.work();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(2, "Burcu Deniz", 25000);
        juniorDeveloper.work();
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(3, "Ayşen Agay", 25000);
        juniorDeveloper1.work();
       // JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[]{juniorDeveloper1, juniorDeveloper};

        MidDeveloper midDeveloper = new MidDeveloper(4, "Emre", 35000);
        midDeveloper.work();
        MidDeveloper midDeveloper1 = new MidDeveloper(5, "Zeynep", 35000);
        midDeveloper1.work();
       // MidDeveloper[] midDevelopers = new MidDeveloper[]{midDeveloper1, midDeveloper};

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(7, "Zehra", 45000);
        seniorDeveloper.work();
        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(6, "Ayşe", 45000);
        seniorDeveloper1.work();
       // SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[]{seniorDeveloper, seniorDeveloper1};


        HRManager hrManager = new HRManager(1,"Elif Koyun", 25000, new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        System.out.println("HR Manager Salary: " + hrManager.getSalary());

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(1, juniorDeveloper);
        hrManager.addEmployee(0, midDeveloper);
        hrManager.addEmployee(1, midDeveloper1);
        hrManager.addEmployee(0, seniorDeveloper1);
        hrManager.addEmployee(0, seniorDeveloper);

        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniorDeveloper()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMidDeveloper()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniorDeveloper()));


    }
}
