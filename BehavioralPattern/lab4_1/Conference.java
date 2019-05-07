package lab4_1;

public class Conference extends Leader{
    public Conference(String name){
        super(name);
    }
    public void handleRequest(ApprovalRequest request){
        if(request.getMoney()>200000){
            System.out.println("会议"+name+"审批采购单"+request.getPurchaseOrder()+"审批金额为"+request.getMoney()+"元");
        }
        else{
            if(this.successor!=null){
                this.successor.handleRequest(request);
            }
        }
    }
}
