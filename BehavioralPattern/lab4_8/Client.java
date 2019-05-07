package lab4_8;

public class Client {
    public static void main(String[] args){
        Book book1;
        book1=new ComputerBook();
        System.out.println("买了一本计算机图书，原价45.00，打折后价格为："+book1.priceAfterDiscount(45.00));
        Book book2=new LanguageBook();
        System.out.println("买了一本语言图书，原价80.00，打折后价格为："+book2.priceAfterDiscount(80.00));
        Book book3=new NovelBook();
        System.out.println("买了一本小说，原价138.75，打折后价格为："+book3.priceAfterDiscount(138.75));
        //System.out.println(138.75/100);
    }
}
