import java.util.Scanner;

public class IfelseClasue {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks ");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        System.out.println("Your get marks "+marks);
        if(marks>=18){
            System.out.println("Congratulations You passed");
        }else {
            System.out.println("unfortunelity You failed");
        }
    }
}
