package lab4_1;

public class Client {
    public static void main(String[] args){
        Leader objDirector,objManager,objViceGeneralManager,objGeneralManager,objConference;
        objDirector=new Director("张张");
        objManager=new Manager("敖瑞");
        objViceGeneralManager=new ViceGeneralManager("孙司钥");
        objGeneralManager=new GeneralManager("黄程");
        objConference=new Conference("审批采购单");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objViceGeneralManager);
        objViceGeneralManager.setSuccessor(objGeneralManager);
        objGeneralManager.setSuccessor(objConference);

        ApprovalRequest ar1=new ApprovalRequest("采购单1",8000);
        objDirector.handleRequest(ar1);

        ApprovalRequest ar2=new ApprovalRequest("采购单2",12000);
        objDirector.handleRequest(ar2);

        ApprovalRequest ar3=new ApprovalRequest("采购单3",57000);
        objDirector.handleRequest(ar3);

        ApprovalRequest ar4=new ApprovalRequest("采购单4",120000);
        objDirector.handleRequest(ar4);

        ApprovalRequest ar5=new ApprovalRequest("采购单5",210000);
        objDirector.handleRequest(ar5);


    }
}
