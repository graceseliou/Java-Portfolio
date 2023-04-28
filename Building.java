public abstract class Building {
    private double purchaseCost;
    private String buildingColor;
    private String ownerName;
    private Address address;

    public Building(Address address, double purchaseCost, String buildingColor, String ownerName){
    this.address = address;
    this.purchaseCost = purchaseCost;
    this.buildingColor = buildingColor;
    this.ownerName = ownerName;
    }

    public abstract double calculateVolume();

    public String getInfo(){
        return "Building Information: \n" +
                "Address | " + address.getInfo() + "\n" +
                "Purchase cost: $" + this.purchaseCost + "\n" +
                "Building color: " + this.buildingColor + "\n" +
                "Owner name: " + this.ownerName + "\n" +
                "Volume: " + calculateVolume();
    }
}
