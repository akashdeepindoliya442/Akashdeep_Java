//This Is My Sixth Program Of Printing Patterern Of ' + ' By Nested for Loop
import java.util.Scanner;
class Day_06_In_Java{
    public static void main(String[] args) {
        System.out.println("Input Rows And Columns For A Pattern Formed By' + '");
        Scanner s=new Scanner(System.in);
        System.out.print("Input Rows Number:");
        int Rows=s.nextInt();
        Scanner c=new Scanner(System.in);
        System.out.print("Input Columns Number:");
        int Columns=c.nextInt();
        for(int i=1;i<=Rows;i++){
            for(int j=1;j<=Columns;j++){
                System.out.print(" + ");
            }
            System.out.println();
        }
        s.close();
        c.close();
    }
}