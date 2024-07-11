import java.util.Scanner;

public class whileLoopInfintie {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (true){
            System.out.println("It will excutes Infinite..");
            if(n==0){
                break;
            }
        }




    }
}
