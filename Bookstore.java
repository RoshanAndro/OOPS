import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String title;
    String author;

    Book(String publisherName, String title, String author) {
        super(publisherName);
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Publisher: " + publisherName);
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
    }
}

class Literature extends Book {
    Literature(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }
    
    void displayDetails() {
        System.out.println("Category : Literature");
        super.displayDetails();
    }
}

class Fiction extends Book {
    Fiction(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }


    void displayDetails() {
        System.out.println("Category : Fiction");
        super.displayDetails();
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1));
            System.out.print("Enter category (Literature/Fiction): ");
            String category = sc.nextLine();

            System.out.print("Enter publisher name: ");
            String publisher = sc.nextLine();

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            if (category.equalsIgnoreCase("Literature")) {
                books[i] = new Literature(publisher, title, author);
            } else if (category.equalsIgnoreCase("Fiction")) {
                books[i] = new Fiction(publisher, title, author);
            } else {
                System.out.println("Unknown category! Skipping...");
                i--;
            }
        }

        System.out.println("\n--- Book Details ---");
        for (Book b : books) {
            System.out.println("----------------------");
            b.displayDetails();
        }

        sc.close();
    }
}

