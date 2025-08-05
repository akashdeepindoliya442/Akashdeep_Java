//This Is My Fifth Java Program To Find Multiples Of Any Number.
import java.util.Scanner;
class Day_05_In_Java{
    public static void main(String[] args) {
        System.out.println("\n\nWant To Get Multiples Of Any Number?");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int a=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a+"x"+i+"="+a*i);
            i++;
        }
        sc.close();


    }
}
