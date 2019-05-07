package lab4_5;

public class UserInfoDTO {
    private String account;
    private String password;
    private String telNo;

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public Memento saveMemento(){
        return new Memento(account,password,telNo);
    }
    public void restoreMemento(Memento memento){
        this.account=memento.getAccount();
        this.password=memento.getPassword();
        this.telNo=memento.getTelNo();
    }

    public void show(){
        System.out.println("account:"+this.account);
        System.out.println("password:"+this.password);
        System.out.println("telNo:"+this.telNo);
    }
}
