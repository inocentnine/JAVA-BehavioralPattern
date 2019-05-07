package lab4_9;

import java.util.Observable;
import java.util.Observer;

public class Member implements Observer {
    public void update(Observable o, Object arg) {
        Product product=(Product)o;
        if(arg instanceof String){
            //name=(String)arg;
            System.out.println("商品更名为："+product.getName());
        }
        if(arg instanceof Double){
            //price=((Double)arg).doubleValue();
            System.out.println("商品价格变为："+product.getPrice());
        }
        //System.out.println("商品更名为："+product.getName()+"，价格变为："+product.getPrice());
    }
}
