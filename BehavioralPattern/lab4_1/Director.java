package lab4_1;

public class Director extends Leader{
    public Director(String name){
        super(name);
    }
    public void handleRequest(ApprovalRequest request){
        if(request.getMoney()<10000){
            System.out.println("主任"+name+"审批采购单"+request.getPurchaseOrder()+"审批金额为"+request.getMoney()+"元");
        }
        else{
            if(this.successor!=null){
                this.successor.handleRequest(request);
            }
        }
    }
}
