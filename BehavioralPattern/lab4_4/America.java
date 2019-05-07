package lab4_4;

public class America extends Country{
    public America(){
        this.name=new String("America");
    }
    public void sendMessageByWTO(String country,String msg){
        wto.sendMessage(this.name,country,msg);
    }
}
