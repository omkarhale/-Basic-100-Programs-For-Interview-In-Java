import java.util.Scanner;

public class ExpecationHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Divide By Zero...");
        }
    }
}
