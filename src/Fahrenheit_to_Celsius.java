import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        float temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit");
        temp=sc.nextInt();
        temp=((temp-32)*5)/9;
        System.out.println("In Celsius is "+temp);

    }
}
