package lab4_7;

public abstract class PersonalRole {
    protected GameAccount gameAccount;
    protected int point;//剩余积分
    protected String grade;//人物等级
    public abstract void checkPersonalRole(int score);

    public void play(int score,String result){
        if(result.equals("win")){
            System.out.println(gameAccount.getName()+"赢了游戏，增加"+score+"积分");
            this.point+=score;
            checkPersonalRole(score);
            System.out.println("剩余积分："+this.point+",当前等级："+gameAccount.getRole().grade);
        }
        if(result.equals("lose")){
            System.out.println(gameAccount.getName()+"输了游戏，扣除"+score+"积分");
            this.point-=score;
            checkPersonalRole(score);
            System.out.println("剩余积分："+this.point+",当前等级："+gameAccount.getRole().grade);
        }
    }
    public void doubleScore(int score,String result){
        if(result.equals("win")){
            System.out.println(gameAccount.getName()+"赢了游戏，增加"+2*score+"积分");
            this.point+=2*score;
            checkPersonalRole(score);
            System.out.println("剩余积分："+this.point+",当前等级："+gameAccount.getRole().grade);
        }
        if(result.equals("lose")){
            System.out.println(gameAccount.getName()+"输了游戏，扣除"+score+"积分");
            this.point-=score;
            checkPersonalRole(score);
            System.out.println("剩余积分："+this.point+",当前等级："+gameAccount.getRole().grade);
        }
    }
    public void changeCards(){
        System.out.println(gameAccount.getName()+"玩家换牌");
    }
    public void peekCards(){
        System.out.println(gameAccount.getName()+"玩家偷看他人的牌");
    }

    public int getPoint() {
        return point;
    }

    public String getGrade() {
        return grade;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
