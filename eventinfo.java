import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class App {

    public static String brideName() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the name of the bride: ");
        String userInput = scnr.nextLine();

        return userInput;
    }

    public static String groomName() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the name of the groom: ");
        String userInput = scnr.nextLine();

        return userInput;
    }

    public static int numOfGuests() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of guests at the wedding: ");
        int userInput = scnr.nextInt();

        return userInput;
    }

    public static double locationSize() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the square footage of the location: ");
        double userInput = scnr.nextDouble();

        return userInput;
    }

    public static ArrayList<String> songNames() {
        Scanner scnr = new Scanner(System.in);
        
        ArrayList<String> songNames = new ArrayList<>();
        String userInput;
        boolean done = false;

        while (!done) {
            System.out.println("Enter a song (or Quit to exit): ");
            userInput = scnr.nextLine();
            if (userInput.equals("Quit")) {
                done = true;
            }
            else {
                songNames.add(userInput);
            }
        }

        return songNames;
    }

    public static double guestsInLocation(int numOfGuests, double locationSize) {
        return ((double) numOfGuests / locationSize);
    }

    public static void writeFile(String brideName, String groomName, int numOfGuests, double locationSize, ArrayList<String> songNames, double guestsInLocation) {
        PrintWriter out = null;
        String fileName = "wedding.txt";

        try {
            out = new PrintWriter(fileName);
            out.println("Bride name: " + brideName);
            out.println("Groom name: " + groomName);
            out.println("You will have " + numOfGuests + " guests.");
            out.println("Location size (square footage): " + locationSize);
            out.println(songNames);
            out.println("Number of guests per square foot of your location: " + guestsInLocation);
        }
        catch (FileNotFoundException fne) {
            System.out.println(fne.getMessage());
        }
        finally {
            if(out != null) {
                out.close();
            }
        }
    }

    public static void readFile() {
        File fileToRead = new File("wedding.txt");
        Scanner readScanner = null;

        try {
            readScanner = new Scanner(fileToRead);
            while (readScanner.hasNextLine()) {
                String newLine = readScanner.nextLine();
                System.out.println(newLine);
            }
        }
        catch (FileNotFoundException fne) {
            System.out.println(fne.getMessage());
        }
        finally {
            if(readScanner != null) {
                readScanner.close();
            }
        }
        
    }

    public static void main(String[] args) {
            String bride = brideName();
            String groom = groomName();
            int guests = numOfGuests();
            double sqFoot = locationSize();
            ArrayList<String> songs = songNames();
            double calcSqFootFromGuests = guestsInLocation(guests, sqFoot);
            writeFile(bride, groom, guests, sqFoot, songs, calcSqFootFromGuests);
            readFile();
    }
}
