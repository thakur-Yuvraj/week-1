// Rewrite the Sample Program 2 with user inputs
// Hint => 
// Create variables and take user inputs for name, fromCity, viaCity, toCity
// Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
// Create Variables and take time taken 
// Finally, print the result and try to understand operator precedence.
// I/P => fee, discountPrecent
// O/P => The results of Int Operations are ___, ___, and ___


import java.util.Scanner;

class Travel {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = input.nextLine();

        // input the cities
        System.out.println("Enter the city the person is starting from");
        String fromCity = input.nextLine();
        
        System.out.println("Enter the via city");
        String viaCity = input.nextLine();
        
        System.out.println("Enter the end city");
        String toCity = input.nextLine();

        // input the distances in miles
        System.out.println("Enter the distance from " + fromCity + " to " + viaCity);
        double distanceFromToVia = input.nextDouble();

        System.out.println("Enter the distance from " + viaCity + " to " + toCity);
        double distanceViaToFinalCity = input.nextDouble();

        // input time taken in min
        System.out.println("Enter the time taken to travel from " + fromCity + " to " + viaCity);
        int timeFromToVia = input.nextInt();

        System.out.println("Enter the time taken to travel from " + viaCity + " to " + toCity);
        int timeViaToFinalCity = input.nextInt();

        // calculate  total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        
        System.out.println("\nTravel Details for " + name + ":");
        System.out.println("The total distance travelled by " + name + " from " + fromCity + " to " + toCity +
                           " via " + viaCity + " is " + totalDistance + " miles.");
        System.out.println("The total time taken is " + totalTime + " minutes.");
        
        
        input.close();
    }
}
