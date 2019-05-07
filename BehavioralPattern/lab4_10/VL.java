package lab4_10;

public class VL extends Changer{
    public VL(Phone phone){
        super(phone);
        System.out.println("手机发出声音、震动并闪烁灯光提醒主人");
    }

    public void callerAlert3() {
        System.out.println("发出震动，灯光闪烁");
    }
}
