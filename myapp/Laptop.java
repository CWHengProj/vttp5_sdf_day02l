package myapp;

public class Laptop extends Computer {
    private String operatingSystem;
    private Integer weight;
    private String battery;
    private String screenSize;


    
    public Laptop() {
    }
    public Laptop(String cpu, String brand, int ram) {
        super(cpu, brand, ram);
    }
    
    public Laptop(String cpu, String brand, int ram, String operatingSystem, Integer weight, String battery,
            String screenSize) {
        super(cpu, brand, ram);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    @Override
    public void start(){
        System.out.println("Computer starting up..");
    }
    @Override
    public void shutDown(){
        System.out.println("Computer shutting down...");
    }
    @Override
    public void displaySpec(){
        System.out.printf("The specs of the laptop are: \n CPU: %s\n Brand: %s\n RAM: %s\n OS: %s\n Battery: %s, Screensize: %s\n", this.getCpu(), this.getBrand(), this.getRam(), this.getOperatingSystem(), this.getBattery(), this.getScreenSize());
    }
}    
