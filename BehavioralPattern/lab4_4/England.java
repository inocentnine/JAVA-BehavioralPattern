package lab4_4;

public class England extends Country{
    public England(){
        this.name=new String("England");
    }
    public void sendMessageByWTO(String country,String msg){
        wto.sendMessage(this.name,country,msg);
    }
}
