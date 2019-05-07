package lab4_8;

public class Person {
    private Book book;
    public void setBook(Book book){
        this.book=book;
    }
    public double  priceAfterDiscount(double price){
        book.priceAfterDiscount(price);
        return price;
    }
}
