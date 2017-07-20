import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int studentNumber = 0;
        String userWants;
        String answer = "y";
        String again = "y";
        Scanner scan = new Scanner(System.in);

        String[] className = {"Mo", "Tresa", "David", "Brittany", "Bob", "Linda", "Gene", "Louise", "Teddy", "Troy", "Abed", "Shirley", "Annie", "Jeffery", "Pierce", "Chang", "Dean", "Drake", "Keith", "Gagan"};
        String[] highSchool = {"Mass", "Techtown", "Davidson", "Blockhigh", "Browntown", "Limehigh", "Greenville", "Lakehigh", "Tealhigh", "turquoisehigh", "Apricothigh", "Silverhigh", "Aquahigh", "Jadehigh", "Purplehigh", "Coralhigh", "Darkhigh", "Darkerhigh", "Kakihigh", "Greyhigh"};
        String[] favColor = {"Mauve", "Taupe", "Darkbrown", "Black", "Brown", "Lime", "Green", "lavender", "Teal", "turquoise", "Apricot", "Silver", "Aqua", "Jade", "Purple", "Coral", "DarkBlue", "DrakRed", "Kaki", "Grey"};

        System.out.println("Welcome to TechHire 2017 Student Directory");
        do {
            try {
                System.out.println("Please enter a student number to learn more (1-20):");
                studentNumber = scan.nextInt();
                scan.nextLine();
                System.out.println("Your student is " + className[studentNumber - 1]);

                do {
                System.out.println("What would you like to know? Enter 'high school' or 'favorite color':");
                userWants = scan.nextLine();

                    if (userWants.contains("school")) {
                        System.out.println("Your student attended " + highSchool[studentNumber - 1] + "high school");
                        break;
                    } else if (userWants.contains("color")) {
                        System.out.println("Your student's favorite color is " + favColor[studentNumber - 1]);
                        break;
                    } else {
                        System.out.println("Error! You did not 'high school' or 'favorite color'. Would you like to continue (y/n)");
                        again = scan.nextLine();
                    }

                }
                while (again.equalsIgnoreCase("y"));


                System.out.println("Would you like to learn more about another student? (y/n)");
                answer = scan.nextLine();


            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You did not enter a valid student number");
            }
        } while (answer.equalsIgnoreCase("y")); {

            System.out.println("Thank you for using TechHire 2017 Student Directory. Goodbye ");

        }

    }
}


