import java.util.ArrayList;

public class Developer extends Employee  {
    private ArrayList<Technology> technologies =new ArrayList<>();
    public Developer(String name, String surname, String city, String email, String Pesel, int year) {
        super("john","doe","newYork","john@doe.com","123456789",2020);
    }



    public void addTechnology(Technology technology) {
    technologies.add(technology);

    }

@Override
    public int  calculateSalary(){
        int base=super.calculateSalary();
        int bonus=0;
        for (Technology tech:technologies){
            bonus += tech.getBonus();
        }
        return base +bonus;
    }
}




