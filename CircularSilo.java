public class CircularSilo extends Building {
    private double radius;
    private double height;

    public CircularSilo(Address address, double purchaseCost, String buildingColor, String ownerName, double radius, double height){
        super(address, purchaseCost, buildingColor, ownerName);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\n" +
                "Radius: " + this.radius + "\n" +
                "Height: " + this.height;
    }

    @Override
    public double calculateVolume(){
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
}
