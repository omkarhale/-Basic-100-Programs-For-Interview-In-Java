import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
