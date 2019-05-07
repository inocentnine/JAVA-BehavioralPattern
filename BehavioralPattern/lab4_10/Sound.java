package lab4_10;

public final class Sound implements Phone{
    public Sound(){
        System.out.println("手机发出声音提醒主人");
    }

    @Override
    public void callerAlert() {
        System.out.println("发出声音");
    }
}
