package Attractions;

import Attractions.Attraction;

public class Rollercoaster extends Attraction implements ISecurity{

    public Rollercoaster(String name, Integer capacity){
        super(name, capacity);
    }

    public boolean securityCheck(Visitor visitor){
        if(visitor.getHeight() < 155){
            return false;
        }else{
            return true;
        }
    };

    public void boardVisitor(Visitor visitor) {
        if(securityCheck(visitor)){
            this.addVisitor(visitor);
        }
    }

};
