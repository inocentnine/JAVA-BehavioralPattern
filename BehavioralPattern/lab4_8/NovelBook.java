package lab4_8;

public class NovelBook implements Book{
    public double  priceAfterDiscount(double price){
        if(price/100>=1){
            return price-Math.floor(price/100)*10;
        }else{
            return price;
        }
    }
}
