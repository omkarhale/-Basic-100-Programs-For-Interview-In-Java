import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        int a=25;
        int b=50;
        Scanner sc=new Scanner(System.in);
        System.out.println("Before Swapping "+a+" "+b+" ");
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swpping "+a+" "+b+" ");

    }
}
