package lab4_7;

public class Final extends PersonalRole{
    public Final(PersonalRole role){
        this.gameAccount=role.gameAccount;
        this.point=role.getPoint();
        this.grade="骨灰级";
    }
    public void checkPersonalRole(int score){
        if(point<5000&&point>=1000){
            gameAccount.setRole(new Professional(this));
        }
        else if(point<1000&&point>=100){
            gameAccount.setRole(new Secondary(this));
        }
        else if(point<100){
            gameAccount.setRole(new Primary(this));
        }
    }
}
