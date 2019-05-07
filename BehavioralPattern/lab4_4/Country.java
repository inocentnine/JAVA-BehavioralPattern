package lab4_4;

public abstract class Country {
    protected String name;
    protected UnitedNations wto,who,wfc;

    public String getName() {
        return name;
    }

    public UnitedNations getWto() {
        return wto;
    }

    public UnitedNations getWho() {
        return who;
    }

    public UnitedNations getWfc() {
        return wfc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWto(UnitedNations wto) {
        this.wto = wto;
    }

    public void setWho(UnitedNations who) {
        this.who = who;
    }

    public void setWfc(UnitedNations wfc) {
        this.wfc = wfc;
    }

    public abstract void sendMessageByWTO(String country,String msg);
    public void sendMessageByWHO(String country,String msg){
        who.sendMessage(this.name,country,msg);
    }
    public void sendMessageByWFC(String country,String msg){
        wfc.sendMessage(this.name,country,msg);
    }

    public void receiveMessage(String c,String msg){
        System.out.println(name+"收到来自"+c+"的消息：“"+msg+"”");
    }
}
