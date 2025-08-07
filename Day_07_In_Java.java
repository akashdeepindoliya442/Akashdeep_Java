//This Program Help To Print A Hollow Ractangle Pattern of '+'
import java.util.Scanner;
public class Day_07_In_Java {
    public static void main(String[] args) {
        System.out.println("Printing A Hollow Ractangle!");  
        Scanner s=new Scanner(System.in);
        System.out.print("Enter How Many Rows You Want To Print In A Hollow Ractangle:"); 
        int R=s.nextInt();
        Scanner c=new Scanner(System.in);
        System.out.print("Enter How Many Rows You Want To Print In A Hollow Ractangle:");
        int C=c.nextInt();
        for(int i=1;i<=R;i++){
            for(int j=1;j<=C;j++){
                if(i==1||j==1||i==R||j==C){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();
        c.close();
    }
}
