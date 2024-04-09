package Book;

import java.time.LocalDate;

public class Borrow {
    private String borrowID;
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    public Borrow(String borrowID, Book book, Member member, LocalDate borrowDate, LocalDate returnDate) {
        this.borrowID = borrowID;
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(returnDate);
    }
    public String getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(String borrowID) {
        this.borrowID = borrowID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
