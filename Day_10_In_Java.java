//This Program Helps To Print The Multiplication Of Three Numbers With The Help Of Function!
import java.util.Scanner;
public class Day_10_In_Java{
    public static int CalculateMultiplication(int a, int b, int c){
        int Multiplication=a*b*c;
        return Multiplication;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Value:");
        int a=sc.nextInt();
        System.out.print("Enter Second Value:");
        int b=sc.nextInt();
        System.out.print("Enter Third Value:");
        int c=sc.nextInt();
        int Multipication=CalculateMultiplication(a, b, c);
        System.out.println("Multiplication Is:"+Multipication);
        sc.close();

    }
}