package myapp;
public class Computer {

    private String cpu;
    private String brand;
    private int ram;
    

    public Computer(){

        this.cpu = "2GHZ";
        this.brand="Lenovo";
        this.ram=8;

    } //default constructor, if there are no details given
    
    public String getCpu() {
            return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public Computer(String cpu, String brand, int ram) {
            this.cpu = cpu; //this refers to the class level variable
            this.brand = brand;
            this.ram = ram;
        }

    public void start(){
        System.out.println("Computer starting up..");
    }
    public void shutDown(){
        System.out.println("Computer shutting down...");
    }
    public void displaySpec(){
        System.out.printf("The specs of the computer are: \n CPU: %s\n Brand: %s\n RAM: %s", this.cpu, this.brand, this.ram);
    }
}