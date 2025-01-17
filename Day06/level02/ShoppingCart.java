// Program to Simulate a Shopping Cart
// Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
// Add an item to the cart.
// Remove an item from the cart.
// Display the total cost.
// Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.

// import java.util.*;

// Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
// Add an item to the cart.

class Item{
    // attributes
    String itemName;
    int price;
    int quantity;

    // constructor to create item
    Item(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // method to display item
    void display() {
        System.out.println(itemName + " price is : " + price + "Quantity is : "+ quantity);
    }
}

class Cart {
    // attributes
    int space;
    int cartId;
    Item[] itemList;
    int itemListIdx = 0;

    // constructor
    Cart(int space, int cartId) {
        this.space = space;
        this.cartId = cartId;
        itemList = new Item[space];
    }

    // method adding item to cart
    void addItem(Item item) {
        // if cart is full then we do not add item
        if (itemListIdx > space) {
            System.out.println("Cart is full and cannot append this/these item");
            return;
        }
        itemList[itemListIdx++] = item;
        
    }

    // method to remove empty space
    void removeNull(int delIdx) {
        while(itemList[delIdx+1] != null && delIdx+1 < space) {
            itemList[delIdx] = itemList[delIdx+1];
        }
        itemListIdx--;
    }
        
    

    // method to remove an item
    Item removeItem(String itemName) {
        // looping to find the item
        Item removedItem = null;
        // Item removedItem = new Item(itemName, 0, 0);
        for (int i = 0; i <= itemListIdx; i++) {
            if (itemList[i].itemName == itemName) {
                removedItem = itemList[i];
                itemList[i] = null;
                removeNull(i);
            }
        }
        return removedItem;
    }


    // method to compute cost
    int getCost() {
        int totalPrice = 0;
        for(int i = 0; i < itemListIdx; i++) {
            totalPrice += itemList[i].price * itemList[i].quantity;
        }
        return totalPrice;
    }

    // method to display cost
    void displayCost() {
        int price = getCost();
        System.out.println("The total item cost is : "+ price);
    }
    void displayItem() {
        for(int i = 0; i < itemListIdx; i++) {
            itemList[i].display();
        }
    }

}


public class ShoppingCart {
    public static void main(String[] args) {
        // creating a cart object
        Cart cart1 = new Cart(100, 5544);
        cart1.addItem(new Item("shivam", 999, 43));
        cart1.addItem(new Item("Laptop", 60000, 1));
        cart1.addItem(new Item("Phone", 15000, 2));
        
        cart1.displayItem();
        cart1.displayCost();
        // newline
        System.out.println("-----------");
        cart1.removeItem("Phone");
        cart1.displayItem();

        cart1.displayCost();
        
    }
}
