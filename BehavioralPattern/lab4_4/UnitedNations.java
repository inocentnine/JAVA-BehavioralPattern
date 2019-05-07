package lab4_4;

import java.util.Hashtable;

public abstract class UnitedNations {
    protected String name;
    protected Hashtable<String,Country> country;

    public UnitedNations(){
        this.country=new Hashtable<String,Country>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCountry(Country c){
        if(country==null)
            return;
        country.put(c.getName(),c);
    }
    public void delCountry(Country c){
        if(country==null)
            return;
        country.remove(c.getName());
    }

    protected void sendMessage(String from,String to,String msg){
        Country c=country.get(to);
        if(c!=null)
            c.receiveMessage(from,msg);
        else
            System.out.println("对不起该国家可能还未加入UN！");
    }

    public void receiveMessage(String from,String to,String msg){
        sendMessage(from,to,msg);
    }
}
