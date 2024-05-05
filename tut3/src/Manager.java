import java.util.ArrayList;
public class Manager extends Employee{
    private ArrayList<Goal> goals = new ArrayList<>();
    public Manager(String name, String surname, String city, String email, String Pesel, int year) {
        super(name, surname, city, email, Pesel, year);
    }


    public void addGoals(Goal goal) {
    goals.add(goal);
    }
    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Goal goal : goals) {

        }
        return baseSalary + bonus;
    }

}
