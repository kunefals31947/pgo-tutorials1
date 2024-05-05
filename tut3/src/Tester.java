import java.util.ArrayList;
public class Tester extends Employee{
    private ArrayList<String> testType = new ArrayList<>();
    public Tester(String name, String surname, String city, String email, String Pesel, int  year) {
        super("jane", "smith","losAngeles","jane@smith.com","987654321",2021);
    }

    public void addTestType(String testTypes) {
        testType.add(testTypes);
    }
@Override
    public int calculateSalary(){
    return super.calculateSalary() + testType.size() * 300;
}

}
