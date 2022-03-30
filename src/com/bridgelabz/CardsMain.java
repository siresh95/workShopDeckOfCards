package com.bridgelabz;

public class CardsMain {

    public static void main(String[] args) {
        DeckOfCards deckOfCard= new DeckOfCards();
        deckOfCard.init();
        deckOfCard.shuffle();
        deckOfCard.distribute();
        deckOfCard.printDistributedCards();
    }
}