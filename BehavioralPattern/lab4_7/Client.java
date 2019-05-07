package lab4_7;

public class Client {
    public static void main(String[] args){
        GameAccount gameAccount=new GameAccount("张三");
        gameAccount.play(50,"win");
        gameAccount.play(50,"win");
        gameAccount.play(50,"win");
        gameAccount.changeCards();
    }
}
