import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInteraction {



    public static String getDNA(String fileName) {
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            StringBuilder s = new StringBuilder();
            while (scanner.hasNextLine()) {
                s.append(scanner.nextLine());
            }
            return s.toString();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getFilePath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to DNA file: ");
        return scanner.nextLine();
    }


    public static String getStartSequence() {
        Scanner scanner = new Scanner(System.in);
        String s = "";

        System.out.println("Enter the start codon to look for:");
        while (true) {
            s = scanner.next().toUpperCase().trim();
            if (!s.matches("[A-Z]{3}")) {
                System.out.println("invalid codon");
            }
            else break;
        }
        return s;
    }

    public static HashSet<String> getEndCodons() {
        HashSet<String> codons = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String s = "";

        System.out.println("Enter the end codons to look for line by line (type end when done):");
        while (true) {
            s = scanner.next().toUpperCase().trim();
            if (!s.matches("[A-Z]{3}")) {
                System.out.println("invalid codon");
            }
            if (!s.equals("END")) codons.add(s);

            else break;
        }
        return codons;
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while (true) {
            System.out.println("What would you like to do? :");
            System.out.println("0: Save and Quit \n" +
                    "1: Load a Save \n" +
                    "2: Add a DNA Sequence \n" +
                    "3: Load a DNA Sequence \n" +
                    "4: Compare DNA Sequences");
            try {
                n = scanner.nextInt();
                switch (n) {
                    case 0:
                        System.out.println("Add functionality for saving quiting");
                        break;
                    case 1:
                        System.out.println("Add functionality for loading a save");
                        break;
                    case 2:
                        System.out.println("Add functionality for adding DNA sequence");
                        break;
                    case 3:
                        System.out.println("Add functionality for loading a DNA sequence");
                        break;
                    case 4:
                        System.out.println("Add functionality for comparing DNA sequences");
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("That is not a valid input");
            }
        }


    }

}
