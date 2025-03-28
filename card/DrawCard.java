package org.example.card;

public class DrawCard extends Card {
    private int value;
    public DrawCard(String color, int value) {
        super(color);
        this.value = value;
    }

    @Override
    public void action() {
        super.action();
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DrawCard "
                + value +
                 color+" ";
    }
}
