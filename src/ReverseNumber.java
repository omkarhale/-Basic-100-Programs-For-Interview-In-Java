import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number.");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("Number is "+num);
        int rev=0;
        while (num!=0){
            rev=rev*10;
            rev=rev+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}//while(num!0){
//rev=rev*10;
//rev=rev+num/10;
//num=num/10
//sout(rev)
