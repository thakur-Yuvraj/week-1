import java.util.Scanner;

class Item {
    int itemCode = 18;
    String itemName = "Sugar Castle";
    int price = 43497;

    
    // Method to display the properties of a class
    public void display() {
        System.out.println("Item Code is: " + itemCode);
        System.out.println("Item Name is: " + itemName);
        System.out.println("Item Price is: " + price);
    }
}

public class Inventory {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the quantity of the item
        System.out.print("Enter  Quantity of Item: ");
        int quantity = input.nextInt();

        // Create the object of the class
        Item item1 = new Item();

        //Display the details of the item
        item1.display();

        //Get the total price for the quantity
        int totalPrice = item1.price * quantity;
        System.out.print("The total price is: "+totalPrice);

        input.close();
    }
}
