package lab4_10;

public class Vibration extends Changer{
    public Vibration(Phone phone){
        super(phone);
        System.out.println("手机发出声音并震动提醒主人");
    }

    public void callerAlert1() {
        System.out.println("发出震动");
    }
}
