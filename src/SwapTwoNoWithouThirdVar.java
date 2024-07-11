import java.util.Scanner;

public class SwapTwoNoWithouThirdVar {
    public static void main(String[] args) {
        int a=25;
        int b=50;
        Scanner sc=new Scanner(System.in);
        System.out.println("Before Swapping "+a+" "+b+" ");
        a=a + b;
        b=a - b;
        a=a-b;
        System.out.println("After Swpping "+a+" "+b+" ");
    }
}
