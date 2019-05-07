package lab4_7;

public class Primary extends PersonalRole{
    public Primary(PersonalRole role){
        this.gameAccount=role.gameAccount;
        this.point=role.getPoint();
        this.grade="入门级";
    }
    public Primary(GameAccount gameAccount){
        this.point=0;
        this.gameAccount=gameAccount;
        this.grade="入门级";
    }
    public void checkPersonalRole(int score){
        if(point>=5000){
            gameAccount.setRole(new Final(this));
        }
        else if(point>=1000&&point<5000){
            gameAccount.setRole(new Professional(this));
        }
        else if(point>=100){
            gameAccount.setRole(new Secondary(this));
        }
    }
    public void peekCards(){
        System.out.println("对不起，"+gameAccount.getName()+"，您没有权限偷看他人的牌");
    }
    public void changeCards(){
        System.out.println("对不起，"+gameAccount.getName()+"，您没有权限换牌");
    }
    public void doubleScore(int score,String result){
        System.out.println("对不起，"+gameAccount.getName()+"，您没有权限使游戏胜利积分加倍");
    }
}
