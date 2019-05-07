package lab4_5;

public class Memento {
    private String account;
    private String password;
    private String telNo;

    public Memento(String account,String password,String telNo){
        this.account=account;
        this.password=password;
        this.telNo=telNo;
    }

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
}
