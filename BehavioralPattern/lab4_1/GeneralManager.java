package lab4_1;

public class GeneralManager extends Leader{
    public GeneralManager(String name){
        super(name);
    }
    public void handleRequest(ApprovalRequest request){
        if(request.getMoney()<200000){
            System.out.println("总经理"+name+"审批采购单"+request.getPurchaseOrder()+"审批金额为"+request.getMoney()+"元");
        }
        else{
            if(this.successor!=null){
                this.successor.handleRequest(request);
            }
        }
    }
}
