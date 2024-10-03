package myapp;

public class Desktop extends Computer {
    private String operatingSystem;
    private Integer weight;
    private Boolean waterCooling;
    public Desktop() {
    }
    public Desktop(String cpu, String brand, int ram) {
        super(cpu, brand, ram);
    }
    public Desktop(String cpu, String brand, int ram, String operatingSystem, Integer weight, Boolean waterCooling) {
        super(cpu, brand, ram);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.waterCooling = waterCooling;
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
    public Boolean getWaterCooling() {
        return waterCooling;
    }
    public void setWaterCooling(Boolean waterCooling) {
        this.waterCooling = waterCooling;
    }
    

}
