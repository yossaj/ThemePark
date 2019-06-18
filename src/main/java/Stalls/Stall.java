package Stalls;

public abstract class Stall {

    protected String name;
    protected String ownersName;
    protected Integer parkingSpot;

    public Stall(String name, String ownersName, Integer parkingSpot){
        this.name = name;
        this.ownersName = ownersName;
        this.parkingSpot = parkingSpot;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnersName(){
        return this.ownersName;
    }

    public Integer getParkingSpot(){
        return this.parkingSpot;
    }

    public void assignNewParkingSpot(Integer newParkingSpot){
        this.parkingSpot = newParkingSpot;
    }
}
