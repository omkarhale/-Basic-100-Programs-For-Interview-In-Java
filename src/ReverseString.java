import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String original,reverse="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string to reverse ");
        original=sc.nextLine();
        int len=original.length();
        for (int i = len-1; i >=0 ; i--){
            reverse=reverse+original.charAt(i);


        }
        System.out.println("Reverse of entered string is :"+reverse);
    }
}
/*String originnal,rev="";
* input ;
* len=original
* for(int i=len-1;i>=0;i--)
* rev=rev+original.charAt(i)*/
