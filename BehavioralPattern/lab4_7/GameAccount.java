package lab4_7;

public class GameAccount {
    private PersonalRole role;
    private String name;

    public GameAccount(String name){
        this.name=name;
        this.role=new Primary(this);
        System.out.println(this.name+"注册成功！");
        System.out.println("-------------------------------");
    }

    public PersonalRole getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public void setRole(PersonalRole role) {
        this.role = role;
    }

    public void play(int score,String result){
        role.play(score,result);
    }
    public void doubleScore(int score,String result){
        role.doubleScore(score,result);
    }
    public void changeCards(){
        role.changeCards();
    }
    public void peekCards(){
        role.peekCards();
    }
}
