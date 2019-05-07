package lab4_9;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {
    private double price=0;

    @Override
    public void update(Observable o, Object arg) {
//        Product product=(Product)o;
//        System.out.println("商品价格变为："+product.getPrice());
        if(arg instanceof Double){
            price=((Double)arg).doubleValue();
            System.out.println("商品价格变为："+price);
        }
    }
}
