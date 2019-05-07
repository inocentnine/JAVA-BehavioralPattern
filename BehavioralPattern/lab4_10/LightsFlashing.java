package lab4_10;

public class LightsFlashing extends Changer{
    public LightsFlashing(Phone phone){
        super(phone);
        System.out.println("手机发出声音、灯光并闪烁提醒主人");
    }

    public void callerAlert2() {
        System.out.println("灯光闪烁");
    }
}
