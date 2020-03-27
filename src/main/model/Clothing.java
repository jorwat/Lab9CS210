package model;

import java.util.ArrayList;
import java.util.List;

public class Clothing extends Wearable {
    private List<Wearable> wearables = new ArrayList<>();
    private String name;


    public Clothing(String name) {
        super(name);
        this.name = name;
    }

    public void addWearable(Wearable w) {
        wearables.add(w);
    }

    public void display(String onTopOf) {
        System.out.println(name + " on " + onTopOf);
        for (Wearable wearable : wearables) {
            wearable.display(name);
        }
    }
}
