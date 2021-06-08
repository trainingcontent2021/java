package Logistics.Transport;

public class SeaTransport implements Transport {

    @Override
    public void load() {
        System.out.println("Loaded ship with freight");
    }

    @Override
    public void drive() {
        System.out.println("Ship has set Sail");
    }

}
