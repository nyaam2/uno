package org.example.card;

public class GeneralWild extends Card {
    public GeneralWild(String color) {
        super(color);
    }

    @Override
    public void action() {
        super.action();
    }

    @Override
    public String toString() {
        return "GeneralWild "+color+" ";
    }
}
