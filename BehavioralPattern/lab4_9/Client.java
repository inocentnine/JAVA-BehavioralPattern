package lab4_9;

public class Client {
    public static void main(String[] args){
        Product product=new Product();
        Member member=new Member();
        product.addObserver(member);
//        NameObserver nameObserver=new NameObserver();
//        PriceObserver priceObserver=new PriceObserver();
//        product.addObserver(nameObserver);
//        product.addObserver(priceObserver);
        product.setName("橘子味的棒棒糖");
        product.setPrice(5.00);
    }
}
