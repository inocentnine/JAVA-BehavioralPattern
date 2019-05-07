package lab4_4;

public class Client {
    public static void main(String[] args){
        UnitedNations[] un=new UnitedNations[3];
        un[0]=new WTO();
        un[1]=new WHO();
        un[2]=new WFC();

        Country[] countries=new Country[4];
        countries[0]=new America();
        countries[1]=new China();
        countries[2]=new England();
        countries[3]=new Japan();

        for(int i=0;i<un.length;i++){
            for(int j=0;j<countries.length;j++){
                un[i].addCountry(countries[j]);
            }
        }

        for(int i=0;i<countries.length;i++){
            countries[i].setWfc(un[2]);
            countries[i].setWho(un[1]);
            countries[i].setWto(un[0]);
        }

        countries[0].sendMessageByWTO("China","中方台湾问题得解决了");
        countries[1].sendMessageByWTO("America","美国贸易战准备结束吗");
        countries[2].sendMessageByWTO("China","英国和中方将继续合作");
        countries[3].sendMessageByWTO("China","来旅游啊");
    }
}
