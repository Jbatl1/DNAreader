import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInteraction {
    private final Scanner scanner = new Scanner(System.in);


    public String getDNA(String fileName) {
        try (Scanner fileRead = new Scanner(new FileInputStream(fileName))) {
            StringBuilder s = new StringBuilder();
            while (fileRead.hasNextLine()) {
                s.append(fileRead.nextLine());
            }
            return s.toString();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }

    public String getFilePath() {
        System.out.println("Enter path to DNA file: ");
        return this.scanner.nextLine();
    }


    public String getStartSequence() {

        String s = "";

        System.out.println("Enter the start codon to look for:");
        while (true) {
            s = this.scanner.next().toUpperCase().trim();
            if (!s.matches("[A-Z]{3}")) {
                System.out.println("invalid codon");
            }
            else break;
        }
        return s;
    }

    public HashSet<String> getEndCodons() {
        HashSet<String> codons = new HashSet<>();
        String s = "";

        System.out.println("Enter the end codons to look for line by line (type end when done):");
        while (true) {
            s = this.scanner.next().toUpperCase().trim();
            if (!s.matches("[A-Z]{3}")) {
                System.out.println("invalid codon");
            }
            if (!s.equals("END")) codons.add(s);

            else break;
        }
        return codons;
    }



    private String nameDNA() {

    }

    private void createDNA () {

        String filePath = getFilePath();
        String dna = getDNA(filePath);
        String startSequence = getStartSequence();
        HashSet<String> ends = getEndCodons();

    }














    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        boolean quit = false;
        while (!quit) {
            try {
                System.out.println("What would you like to do? :");
                System.out.println("""
                    0: Save and Quit\s
                    1: Load a Save\s
                    2: Add a DNA Sequence\s
                    3: Load a DNA Sequence\s
                    4: Edit a DNA Sequence\s
                    5: Compare DNA Sequences""");
                n = scanner.nextInt();
                switch (n) {
                    case 0:
                        System.out.println("Add functionality for saving quiting");
                        quit = true;
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
                        System.out.println("Add functionality for editing a DNA sequence");
                        break;
                    case 5:
                        System.out.println("Add functionality for comparing DNA sequences");
                        break;
                    default:
                        System.out.println("That is not a valid input");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("That is not a valid input");
            }
        }


    }

}
