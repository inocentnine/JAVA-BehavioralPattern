package lab4_10;

public class Changer implements Phone{
    private Phone phone;
    public Changer(Phone phone){
        this.phone=phone;
    }

    @Override
    public void callerAlert() {
        phone.callerAlert();
    }
}
