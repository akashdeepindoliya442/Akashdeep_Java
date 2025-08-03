//This Is My Third Java Program Of If-Else Statements Of String
import java.util.Scanner;
class Day_03_In_Java{
    public static void main(String[] args) {
        System.out.println("\n\nLets Play A Game, We Are Asking You A Question You Have To Answer It Correct!\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Which Is The Largest Planet In The Solar System:");
        String Planet=sc.next();
        if(Planet.equals("Jupiter")){
            System.out.println("\nCongratulations You Are Correct!\n\n\n");
        }
        else if(Planet.equals("jupiter")){
            System.out.println("\nCongratulations You Are Correct!\n\n\n");
        }
        else if(Planet.equals("Jupitor")){
            System.out.println("\nCongratulations You Are Correct!, Its Jupiter\n\n\n");
        }
        else if(Planet.equals("jupitor")){
            System.out.println("\nCongratulations You Are Correct!, Its Jupitor\n\n\n");
        }
        else{
            System.out.println("\nSorry, Wrong Answer\n\n\n");
        }
        sc.close();
    }
}