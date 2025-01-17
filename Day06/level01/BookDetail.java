class Book {
    String title = "Life";
    String author = "Sahil";
    int price = 1119;

    //Method to display the Book details
    void display() {
        System.out.println("Title of Book: "+title);
        System.out.println("Author of Book: "+author);
        System.out.println("Price of Book: "+price);
    }
}

class BookDetail{
    public static void main(String args[]) {
         
        // Creating the object of the class 
        Book book1 = new Book();

        //Displaying the book
        book1.display();
    }
    
}