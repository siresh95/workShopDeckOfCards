package com.bridgelabz;

public class DeckOfCards {
    String[] SUITS = { "CLUBS", "DIAMOND", "HEARTS", "SPADES" };
    String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
    private String[] decks = new String[52];
    private String[][] playersCards = new String[SUITS.length][RANKS.length];
    private int distributedIndex;

    public void init() {
        for (int i = 0; i < decks.length; i++) {
            decks[i] = RANKS[i % 13] + SUITS[i / 13];
        }
    }


    public void shuffle() {
        for (int i = 0; i < decks.length; i++) {
            int randomIndex = (int) (Math.random() * decks.length);
            String temp = decks[i];
            decks[i] = decks[randomIndex];
            decks[randomIndex] = temp;
        }
    }

    public void distribute() {
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 4; i++) {
                playersCards[i][j] = decks[distributedIndex++];
            }
        }
//		distributedIndex = 0;
    }

    public void print() {
        for (int i = 0; i < decks.length; i++) {
            System.out.println(decks[i]);
        }
    }

    public void printDistributedCards() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Player "+(i+1)+"");
            for (int j = 0; j < 9; j++) {
                System.out.print(playersCards[i][j]+"    ");
            }
            System.out.println("\n");
        }
    }

}