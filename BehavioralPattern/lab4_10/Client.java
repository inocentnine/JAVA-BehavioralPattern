package lab4_10;

public class Client {
    public static void main(String[] args){
        Phone phone=new Sound();
        phone.callerAlert();
        System.out.println("--------------------");
        Vibration vibration=new Vibration(phone);
        vibration.callerAlert();
        vibration.callerAlert1();
        System.out.println("--------------------");
        LightsFlashing lightsFlashing=new LightsFlashing(phone);
        lightsFlashing.callerAlert();
        lightsFlashing.callerAlert2();
        System.out.println("---------------------");
        VL vl=new VL(phone);
        vl.callerAlert();
        vl.callerAlert3();
    }
}
