package model;

import ui.Printer;

import java.util.ArrayList;
import java.util.List;

public class Clothing extends Wearable {
    private List<Wearable> wearables = new ArrayList<>();
    private String name;


    public Clothing(String name) {
        super(name);
        this.name = name;
    }

    // MODIFIES: this
    // EFFECTS: adds a wearable item to the composite
    public void addWearable(Wearable w) {
        wearables.add(w);
    }

    // EFFECTS: displays the result of placing this wearable on top of an item named onTopOf
    @Override
    public void display(String onTopOf) {
        Printer.print(onTopOf, name);
        for (Wearable wearable : wearables) {
            wearable.display(name);
        }
    }
}
