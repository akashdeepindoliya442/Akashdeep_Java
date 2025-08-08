//This Program Helps To Print A Right Angle Triangle 
import java.util.Scanner;
public class Day_08_In_Java {
    public static void main(String[] args) {
        System.out.println("Do You Want To Print A Right Angle Triangle?");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Number Which Is The Base Of That Right Angle Triangle:");
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
            System.out.print("+");
            }
            System.out.println();
        }
    }
    
}