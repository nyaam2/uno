package org.example.card;

public class WildCard extends Card {


    public WildCard(String color) {
        super(color);
    }

    @Override
    public void action() {
        super.action();
    }

    @Override
    public String toString() {
        return "wildCard ";
    }
}
