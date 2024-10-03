

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import myapp.Computer;
import myapp.Desktop;
import myapp.Laptop;

public class app {
    public static void main(String[] args){
        Computer macbook = new Computer();
        macbook.setCpu("5GHz 8 core");
        macbook.setBrand("Macbook Air 8gb");
        macbook.setRam(16);

        macbook.start();
        macbook.displaySpec();
        macbook.shutDown();

        Computer computer2 = new Computer();
         computer2.start();
         computer2.shutDown();
         computer2.displaySpec();

        Laptop laptop01 = new Laptop();
        laptop01.setCpu("10 GHz 128 core");
        laptop01.setBattery("11 Hours");
        laptop01.start();
        laptop01.shutDown();
        laptop01.displaySpec();

        Desktop desktop01 = new Desktop("word","string",12);
        desktop01.displaySpec();
        desktop01.shutDown();
        desktop01.displaySpec();

        List<Computer> machines = new ArrayList<>();
        machines.add(desktop01);
        machines.add(laptop01);
        machines.add(computer2);


        //for statement to display machines
        for (Computer machine : machines)
            System.out.printf("Machine name is %s\n", machine);
    }
}
