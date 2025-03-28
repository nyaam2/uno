package org.example.card;

public class GeneralCard extends Card{
    int value;
    public GeneralCard(String color,int value) {
        super(color);
        this.value = value;
    }

    @Override
    public void action() {
        super.action();
    } public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GeneralCard "+color+" "+value+" ";
    }
}
