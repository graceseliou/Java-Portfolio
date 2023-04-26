import java.util.Scanner;
import java.util.ArrayList;

public class PartnerLab1 {
    public static void main(String[] args) {
    
        Elevator E1 = new Elevator();
        E1.setWeightLimit(500);
        Elevator E2 = new Elevator();
        E2.setWeightLimit(500);
        ArrayList<Person> persons = new ArrayList<>();

        boolean done = false;
        while (!done){
            System.out.println("Enter name (or Q to finish): ");
            Scanner scnr = new Scanner(System.in);
            String userInput = scnr.nextLine();
            if(userInput.equals("Q") || userInput.equals("q")){
                done = true;
            }
            else{
                System.out.println("Enter person weight: ");
                int weightInPounds = scnr.nextInt();
                Person person = new Person(userInput, weightInPounds);
                if(E1.addPerson(E1, person)){
                    E1.addTotalWeight(person);
                    System.out.println(userInput + " added. They add " + weightInPounds + " lbs to elevator 1.");
                }
                else{
                    System.out.println("Person could not be added");
                }
            }
        }

        boolean done2 = false;
        while(!done2){
            System.out.println("Enter name (or Q to finish): ");
            Scanner scnr = new Scanner(System.in);
            String userInput = scnr.nextLine();
            if(userInput.equals("Q") || userInput.equals("q")){
                done2 = true;
            }
            else{
                System.out.println("Enter person weight: ");
                int weightInPounds = scnr.nextInt();
                Person person = new Person(userInput, weightInPounds);
                if(E2.addPerson(E2, person)){
                    E2.addTotalWeight(person);
                    System.out.println(userInput + " added. They add " + weightInPounds + "lbs to elevator 2.");
                }
                else{
                    System.out.println("Person could not be added.");
                }
            }
        }
        System.out.println("\nElevator 1: " + "\n" + E1.getInfo());
        System.out.println("\nElevator 2: " + "\n" + E2.getInfo());
    }
}

