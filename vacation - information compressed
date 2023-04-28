import java.util.*;

public class RoadTrip {
    private String minivan;
    private ArrayList<Passenger> passengersOnTrip = new ArrayList<>();
    private HashMap<String, ArrayList<String>> passengersToFoods = new HashMap<>();
    private HashSet<String> diary = new HashSet<>();

    public RoadTrip(String minivan){
        this.minivan = minivan;
    }

    public Boolean addPassenger(Passenger passenger){
        boolean done = false;
        while(!done){
            if(passengersOnTrip.size() > 8){
                System.out.println("Minivan full");
            }
            else {
                passengersOnTrip.add(passenger);
            }
            done = true;
        }
        return done;
    }

    public void addFavoriteFood(Passenger passenger, String food){
        if(passengersOnTrip.contains(passenger)){
            if(passengersToFoods.containsKey(passenger.getName())){
                passengersToFoods.get(passenger.getName()).add(food);
            }
            else{
                ArrayList<String> foodList = new ArrayList<>();
                foodList.add(food);
                passengersToFoods.put(passenger.getName(), foodList);
            }
        }
        else{
            System.out.println("Food cannot be added; passenger does not exist.");
        }
    }

    public void displayPassengers(){
        Iterator passFoodIter = passengersOnTrip.iterator();
        
        while(passFoodIter.hasNext()){
            Passenger passenger = (Passenger) passFoodIter.next();
            String passengerName = passenger.getName();
            System.out.println("Name: " + passengerName);
            System.out.println("Favorite foods: " + passengersToFoods.get(passengerName));
        }
    }

    public void addDiaryEntry(String diaryEntry){
        diary.add(diaryEntry);
    }

    public void displayDiary(){
        Iterator diaryIter = diary.iterator();
        
        while(diaryIter.hasNext()){
            Object item = diaryIter.next();
            System.out.println(item);
        }

    }
}
