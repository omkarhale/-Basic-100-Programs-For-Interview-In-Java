import java.util.Scanner;

public class elseIfLadder {
    public static void main(String[] args) {
        System.out.println("Enter your Marks");
        Scanner sc=new Scanner(System.in);
        int grade=sc.nextInt();
        if(grade>=90){
            System.out.println("Yor got grade A");
        } else if (grade<90 && grade>80) {
            System.out.println("You got grade B");

        } else if (grade>70 && grade<80) {
            System.out.println("You got grade C");

        }else {
            System.out.println("You got  grade D");
        }
    }
}
