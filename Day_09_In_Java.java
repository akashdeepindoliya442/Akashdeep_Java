//This Program Helps To Print The Butterfly Pattern!
public class Day_09_In_Java{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print("+");
            }
            int Space=2*(n-i);
            for(int j=1;j<=Space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("+");
            }
            System.out.println();
        }
        for(int i=n;i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print("+");
            }
            int Space=2*(n-i);
            for(int j=1;j<=Space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}