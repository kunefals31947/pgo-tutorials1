import com.sun.jdi.event.StepEvent;

import javax.xml.namespace.QName;

public class Employee {
   private String name;
    private String surname;
     private String city;
     private String email;
      private String pesel;
    private int year  ;


    public Employee(String name,String surname,String city,String email, String Pesel, int year) {
       this.name=name;
       this.surname=surname;
       this.city=city;
       this.email=email;
       this.pesel=Pesel;
       this.year=year;

    }



    public int calculateSalary() {

        return  3000+(2024-year)*1000;

    }

}
