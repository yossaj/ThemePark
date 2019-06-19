package Stalls;

import Attractions.Visitor;

import java.util.ArrayList;

public class HotDogStall extends Stall {

    private ArrayList<String> hotDogs;

    public HotDogStall(String name, String ownersName, Integer parkingSpot){
        super(name, ownersName, parkingSpot);
        this.hotDogs = new ArrayList<String>();
    }

    public void topUpDogs(){
        this.hotDogs.add("Hot Dog");
        this.hotDogs.add("Hot Dag");
        this.hotDogs.add("Hot Dawg");
        this.hotDogs.add("Hat Dog");
        this.hotDogs.add("Hawt Dog");
        this.hotDogs.add("Haa Dug");
    }

    public int countStock(){
        return this.hotDogs.size();
    }

    public void sellDogs(Visitor visitor) {
        if(visitor.getMoney() >= 5 ){
           String hotDog = this.hotDogs.remove(0);
           visitor.removeMoney(5);
           visitor.takeFood(hotDog);
        }
    }
}
