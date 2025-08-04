//This Is My Fourth Java File Of Switch Statements.
import java.util.Scanner;
class Firstclass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Favourite Cricketers Jersey No From MS Dhoni,Virat Kohli And Rohit Sharma:");
        int Num=sc.nextInt();
        switch (Num) {
            case 7:System.out.println("Thala For A Reason");
                break;
            case 18:System.out.println("King Kohli");
                break;
            case 45:System.out.println("Hitman");
                break;
            default:System.out.println("Incorrect Jercy No! Try To Pick From 7,18,And,45!");
                break;
        }
        sc.close();
    }   
}
