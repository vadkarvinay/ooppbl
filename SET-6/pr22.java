import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int availableBooks;

    Library(int count) {
        availableBooks = count;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class practical_22 {
    public static void main(String[] args) {

        Library lib = new Library(3);

        try {
            lib.issueBook(2);
            lib.issueBook(2); // will throw exception

        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
