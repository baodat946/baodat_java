package Book;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberID;
    private String name;
    private String email;
    private List<Book> booksBorrowed;
    public Member(String memberID, String name, String email) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.booksBorrowed = new ArrayList<>();
    }
    public void borrowBook(Book book) {
        booksBorrowed.add(book);
    }
    public void returnBook(Book book) {
        booksBorrowed.remove(book);
    }
    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(List<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }
}
