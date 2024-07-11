import java.util.Scanner;

public class StringComparing {
    public static void main(String[] args) {
        System.out.println("Enter a First String...");
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        System.out.println(string1);
        System.out.println("Enter a Second String...");
        String string2=sc.nextLine();
        System.out.println(string2);
        if(string1.compareTo(string2)>0){
            System.out.println("First string is greater than second.");
        } else if (string2.compareTo(string1)>0) {
            System.out.println("Second string is greater than First.");
        }else {
            System.out.println("Both are same ....");
        }
    }
}
