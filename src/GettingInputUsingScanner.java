import java.util.Scanner;
public class GettingInputUsingScanner {
    public static void main(String[] args) {
        int id;
        float money;
        String name;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name ");
        name=sc.nextLine();
        System.out.println("Your Name is "+name);
        System.out.println("Enter Your ID ");
        id=sc.nextInt();
        System.out.println("Your ID is "+id);
        System.out.println("Enter your Salary");
        money=sc.nextFloat();
        System.out.println("My Salary is "+money);
        System.out.println(id+" "+money+" "+name+" ");
    }
}
