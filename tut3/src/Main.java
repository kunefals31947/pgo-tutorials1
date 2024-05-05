import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class Program {
            public static void main(String[] args) {
                ArrayList<Employee> employees = new ArrayList<>();
// Creating and adding developers
                Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
                Technology technology = new Technology("Java", 800);
                dev.addTechnology(technology);
                employees.add(dev);
// Creating and adding testers
                Tester tester = new Tester("Jane", "Smith", "Los angeles", "jane@smith.com", "987654321", 2021);
                tester.addTestType("UI/UX");
                employees.add(tester);
// Creating and adding a manager
                Manager manager = new Manager("Bob", "Johnson",
                        "Chicago", "bob@johnson.com", "1122334455", 2019);
                Goal goal = new Goal(2010, 10, 15, "Implementing FB login",
                        1000);
                manager.addGoals(goal);
                employees.add(manager);
// Calculating total amount to be paid
                int totalAmount = 0;
                for (Employee employee : employees) {
                    totalAmount += employee.calculateSalary();
                }
                System.out.println("Total amount to be paid this month: " + totalAmount + " usd");
            }
        }
    }
