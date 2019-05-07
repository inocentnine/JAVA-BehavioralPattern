package lab4_7;

public class Professional extends PersonalRole{
    public Professional(PersonalRole role){
        this.gameAccount=role.gameAccount;
        this.point=role.getPoint();
        this.grade="高手级";
    }
    public void checkPersonalRole(int score){
        if(point>=5000){
            gameAccount.setRole(new Final(this));
        }
        else if(point<1000&&point>=100){
            gameAccount.setRole(new Secondary(this));
        }
        else if(point<100){
            gameAccount.setRole(new Primary(this));
        }
    }
    public void peekCards(){
        System.out.println("对不起，"+gameAccount.getName()+"，您没有权限偷看他人的牌");
    }
}
