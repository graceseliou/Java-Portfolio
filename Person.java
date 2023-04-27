public class Person {
    private String name;
    private int weightInPounds;

    public Person(String name, int weightInPounds){
        this.name = name;
        this.weightInPounds = weightInPounds;
    }

    public String getName(){
        return this.name;
    }

    public int getWeightInPounds(){
        return this.weightInPounds;
    }

    public String getInfo(){
        return "Name: " + this.name + "\n" +
                "Weight (in pounds): " + this.weightInPounds;
    }
}
