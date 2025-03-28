package org.example.card;

public class SkipCard extends Card {
    public SkipCard(String color) {
        super(color);
    }

    @Override
    public void action() {
        super.action();
    }

    @Override
    public String toString() {
        return "SkipCard,"+color+" ";
    }
}
