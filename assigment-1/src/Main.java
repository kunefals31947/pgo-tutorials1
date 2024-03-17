import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if(i>0){
            System.out.println("The number is positive");
        }else if (i==0){
            System.out.println("number equals 0");
        }else {
            System.out.println("Number is Negative");
        }
        }
    }
