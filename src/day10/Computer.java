package day10;
import java.util.Objects;

/**
 * Day – 3
 * Problem : 5
 * @author Buyantugs
 */
public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;
    Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer=manufacturer;
        this.processor=processor;
        this.ramSize=ramSize;
        this.processorSpeed=processorSpeed;
    }

    public int getRamSize(){
        return ramSize;
    }
    public double getProcessorSpeed(){
        return processorSpeed;
    }
    public double computePower(){
        return ramSize*processorSpeed;
    }
    @Override
    public String toString(){
        return "Computer{"+
                "Manufacturor="+manufacturer+", "+
                "Processor="+processor+", "+
                "RAM size="+ramSize+"GB, "+
                "CPU speed="+processorSpeed+"MHz}";
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;

        Computer computer=(Computer) obj;
        return ramSize==computer.ramSize && processorSpeed==computer.processorSpeed
                && Objects.equals(manufacturer,computer.manufacturer)
                && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }

}
