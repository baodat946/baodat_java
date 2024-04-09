package Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public void borrowBook(String bookID, String memberID) {
        Book bookToBorrow = findBookByID(bookID);
        Member borrowingMember = findMemberByID(memberID);

        if (bookToBorrow != null && borrowingMember != null) {
            if (bookToBorrow.checkAvailability()) {
                borrowingMember.borrowBook(bookToBorrow);
                bookToBorrow.setAvailable(false);
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book is not available for borrowing.");
            }
        } else {
            System.out.println("Book or member not found.");
        }
    }
    public void returnBook(String bookID, String memberID) {
        Book bookToReturn = findBookByID(bookID);
        Member returningMember = findMemberByID(memberID);

        if (bookToReturn != null && returningMember != null) {
            returningMember.returnBook(bookToReturn);
            bookToReturn.setAvailable(true);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book or member not found.");
        }
    }
    private Book findBookByID(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null;
    }
    private Member findMemberByID(String memberID) {
        for (Member member : members) {
            if (member.getMemberID().equals(memberID)) {
                return member;
            }
        }
        return null;
    }
}

