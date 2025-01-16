// Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
// Hint => 
// Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
// Calculate the number of cards in the deck and initialize the deck
// int numOfCards = suits.length * ranks.length;
// Write a Method to Initialize the deck of cards with suits and ranks and return the deck. The deck is an array of strings where each string represents a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
// Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the card iterate over the deck and swap each card with a random card from the remaining deck to shuffle the deck. Please find the steps below
// Step1: Use for Loop Iterate over the deck and swap each card with a random card from the remaining deck
// Step 2: Inside the Loop Generate a random card number between i and n using the following code 
// int randomCardNumber = i + (int) (Math.random() * (n - i));
// Step 3: Swap the current card with the random card
// Write a Method to distribute the deck of n cards to x number of players and return the players. For this Check the n cards can be distributed to x players. If possible then Create a 2D array to store the players and their cards
// Write a Method to Print the players and their cards


import java.util.*;
public class CardGame{
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    //Method to initialize the deck of cards
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    //Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = i + random.nextInt(deck.length - i);
            // Swap the current card with a random card
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
        return deck;
    }

    //Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (cardsPerPlayer * numPlayers > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    //Method to print the players and their cards
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + " has: ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialize and shuffle the deck
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        //Take user input for number of players and cards per player
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        //Distribute the cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

        //Print the players and their cards
        if (players != null) {
            printPlayersAndCards(players);
        }
        scanner.close();
    }
}
