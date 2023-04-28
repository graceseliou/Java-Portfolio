import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;
        String phone;
        String passFavFood;

        System.out.println("Please enter your minivan's nickname: ");
        String minivanName = scnr.nextLine();
       
        RoadTrip rt = new RoadTrip(minivanName);

        boolean done = false;
        while(!done){
            System.out.println("Press any key to start adding passenger information below (or Quit to exit): ");
            String userInput = scnr.nextLine();

            if(!userInput.equalsIgnoreCase("Quit")){
                System.out.println("Enter passenger first name: ");
                firstName = scnr.nextLine();
                System.out.println("Enter passenger last name: ");
                lastName = scnr.nextLine();
                System.out.println("Enter passenger phone number: ");
                phone = scnr.nextLine();

                Passenger passenger = new Passenger(firstName, lastName, phone);
                rt.addPassenger(passenger);
            }
            else{
                System.out.println("You quit.");
                done = true;
            }
        }

        boolean twoDone = false;
        while(!twoDone){
            Scanner fName = new Scanner(System.in);
            Scanner lName = new Scanner(System.in);
            Scanner pFF = new Scanner(System.in);

            System.out.println("Please enter passenger's first name to add their food (or Quit to exit): ");
            firstName = fName.nextLine();

            if(!firstName.equalsIgnoreCase("Quit")){
                System.out.println("Enter their last name to add their food: ");
                lastName = lName.nextLine();
                
                System.out.println("Please enter their favorite foods (or Quit to exit): ");
                passFavFood = pFF.nextLine();
                if(!passFavFood.equalsIgnoreCase("Quit")){
                    rt.addFavoriteFood(new Passenger(firstName, lastName, ""), passFavFood);
                }
                else{
                    System.out.println("You quit.");
                }
            }
            else{
                System.out.println("You quit.");
                twoDone = true;
            }
        }

        rt.addDiaryEntry("Day 1: Travel day, cheese eating, sleeping");
        rt.addDiaryEntry("Day 2: Hiking, swimming, paddleboarding -- day at the lake");
        rt.addDiaryEntry("Day 3: Last day, farmers market, photoshoot, travel home");

        System.out.println("Passenger information: ");
        rt.displayPassengers();
        System.out.println("Diary entries:");
        rt.displayDiary();
    }
}
