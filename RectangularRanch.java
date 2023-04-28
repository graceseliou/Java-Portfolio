public class RectangularRanch extends Building {
    private double length;
    private double width;
    private double height;

    public RectangularRanch(Address address, double purchaseCost, String buildingColor, String ownerName, double length, double width, double height){
        super(address, purchaseCost, buildingColor, ownerName);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\n" +
                "Length: " + this.length + "\n" +
                "Width: " + this.width + "\n" +
                "Height: " + this.height;
    }

    @Override
    public double calculateVolume(){
        double volume = length * width * height;
        return volume;
    }
}
