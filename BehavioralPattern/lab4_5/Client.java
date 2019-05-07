package lab4_5;

public class Client {
    public static void main(String[] args){
        UserInfoDTO user=new UserInfoDTO();
        Caretaker c=new Caretaker();
        Caretaker cc=new Caretaker();

        user.setAccount("zhangsan");
        user.setPassword("123456");
        user.setTelNo("888888");
        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());
        System.out.println("-------------------------");

        user.setPassword("12345678");
        user.setTelNo("666666");
        System.out.println("状态二：");
        user.show();
        cc.setMemento(user.saveMemento());
        System.out.println("-------------------------");

        user.setPassword("111111");
        user.setTelNo("131000000");
        System.out.println("状态三：");
        user.show();
        System.out.println("-------------------------");

        user.restoreMemento(cc.getMemento());
        System.out.println("回到状态二：");
        user.show();
        System.out.println("-------------------------");

        user.restoreMemento(c.getMemento());
        System.out.println("回到状态一：");
        user.show();
        System.out.println("-------------------------");
    }
}
