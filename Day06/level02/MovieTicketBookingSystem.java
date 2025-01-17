// Program to Model a Movie Ticket Booking System
// Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
// Book a ticket (assign seat and update price).
// Display ticket details.
// Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.



import java.util.Random;

// Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
// Book a ticket (assign seat and update price).
class MovieTicket {
	// Attribute of Movie ticket class
	private String movieBooked;
    private int seatNumber;
    private double amount;
    private int numberofSeats = 120;
    private boolean[] seats = new boolean[numberofSeats];
    private int numberOfMoviesIdx = 4;
    private String[] moviesName = {"ABC", "XYZ", "PSVM", "BTS", "PKMB"};
    private int[] prices = {250, 350, 375, 275, 690};
 
    // Book ticket method definition
    public void bookTicket() {
        Random random = new Random();

        while(true) {
            int seatNum = random.nextInt(numberofSeats);

            if(!seats[seatNum]) {
                seats[seatNum] = true;
                seatNumber = seatNum;
                break;
            }
        }

        int movieIndex = random.nextInt(numberOfMoviesIdx);
        movieBooked = moviesName[movieIndex];
        amount = prices[movieIndex];

        System.out.println("Movie booked is: " + movieBooked + " and it costed " + amount + ". Seat number allocated is: " + seatNumber);
    }
}

public class MovieTicketBookingSystem {
	public static void main(String[] args) {
		// Creating the object of MovieTicket class
		MovieTicket ticket = new MovieTicket();
        ticket.bookTicket();
	}
}
