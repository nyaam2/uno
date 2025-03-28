package org.example.card;

public class ReverseCard extends Card {
    public ReverseCard(String color) {
        super(color);
    }

    @Override
    public void action() {
        super.action();
    }

    @Override
    public String toString() {
        return "Reverse Card "+color+" ";
    }
}
