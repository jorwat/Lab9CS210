package model;

public class Accessory extends Wearable {
    private String name;

    public Accessory(String name) {
        super(name);
        this.name = name;
    }

    // EFFECTS: displays name of the accessory with preceding space
    public void display(String onTopOf) {
        System.out.println(name + " on " + onTopOf);
    }
}
