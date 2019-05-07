package lab4_9;

import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {
    private String name=null;
    @Override
    public void update(Observable o, Object arg) {
//        Product product=(Product)o;
//        System.out.println("商品更名为："+product.getName());
        if(arg instanceof String){
            name=(String)arg;
            System.out.println("商品更名为："+name);
        }
    }
}
