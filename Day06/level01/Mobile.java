
import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    int price;

    // Constructor
    MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Display the data
    public void display() {
        System.out.println("Mobile phone brand: " + brand);
        System.out.println("Mobile phone model: " + model);
        System.out.println("Mobile phone price: " + price);
    }
}

class Mobile {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter MobilePhone details
        System.out.print("Enter Mobile brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Mobile model: ");
        String model = input.nextLine();

        System.out.print("Enter Mobile price: ");
        int price = input.nextInt();

        // Create object of mobilephone class
        MobilePhone mobilePhone1 = new MobilePhone(brand, model, price);

        // Displaying the result
        mobilePhone1.display();

    input.close();

    }
}