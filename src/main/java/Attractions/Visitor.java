package Attractions;

import java.util.ArrayList;

public class Visitor {

    private Integer height;
    private Integer age;
    private Integer money;
    private ArrayList<String> hands;


    public Visitor(Integer height, Integer age, Integer money){
        this.height = height;
        this.age = age;
        this.money = money;
        this.hands = new ArrayList<String>();

    }

    public int getMoney(){
        return this.money;
    }


    public void takeFood(String food){
       this.hands.add(food);
    };

    public int getHeight(){
        return this.height;
    }

    public void removeMoney(int i) {
        money -= i;
    }
}
