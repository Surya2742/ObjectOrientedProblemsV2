package com.bridgelabz.CardsProgram;

public class MainCard {
    public static void main(String[] args) {
        DeckOfCardsInterface deckOfCard = new ImplementationOfCard();
        DeckOfCardsInterface Player = new ImplementationOfCard();
        System.out.println("---------------Before Shuffle-----------");
        deckOfCard.print();
        deckOfCard.shuffle();
        System.out.println("---------------After Shuffle-----------");
        deckOfCard.print();
        deckOfCard.distribute();
        deckOfCard.printDistributedCards();
        Player.playerSortCard();
    }
}
