import java.util.Scanner;

public class AddingTwoMatrix {
    public static void main(String[] args) {
        int m,n;
        System.out.print("Enter the number of rows and columns");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int first[][]=new int[m][n];
        int sec[][]=new int[m][n];
        int sum[][]=new int[m][n];
        System.out.print("Enter the elements of the first matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                first[i][j]=sc.nextInt();

            }

        }
        System.out.print("Enter the elements of the second matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                first[i][j]=sc.nextInt();

            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               sum[i][j]=first[i][j]+sec[i][j];

            }

        }
        System.out.println("Sum of the enter matrix is :-");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j]+"\t");

            }
            System.out.println();

        }


    }
}
