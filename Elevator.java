import java.util.ArrayList;

public class Elevator {
    private int weightLimit;
    private int totalWeight;
    private ArrayList<Person> persons = null;

    public Elevator(){
        this.weightLimit = 0;
        this.totalWeight = 0;
        persons = new ArrayList<>();
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void addTotalWeight(Person person){
        totalWeight += person.getWeightInPounds();
        this.totalWeight = totalWeight;
    }

    public Boolean addPerson(Elevator elevator, Person person) {
        if(elevator.totalWeight + person.getWeightInPounds() > elevator.weightLimit){
            return false;
        }
        else{
            persons.add(person);
            return true;
        }
    }

    public String getInfo() {        
        String info = "\nWeight limit: " + this.weightLimit + "\n" +
                      "Total current weight: " + this.totalWeight + "\n";

        for (Person p: persons){
            info += "\nPerson: " + "\n" + p.getInfo();
        }
        
        return info;
    }
}
