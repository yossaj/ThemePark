package Attractions;

import java.util.ArrayList;

public abstract class Attraction {

    protected String name;
    protected Integer capacity;
    protected ArrayList<Visitor> passengers;

    public Attraction(String name, Integer capacity ){
        this.name = name;
        this.capacity = capacity;
        this.passengers = new ArrayList<Visitor>();
    }

    public String getName(){
        return this.name;
    }

    public void addVisitor(Visitor newPassenger){
        this.passengers.add(newPassenger);
    }

    public void emptyRide(){
        this.passengers.clear();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countPassengers() {
        return this.passengers.size();
    }
}
