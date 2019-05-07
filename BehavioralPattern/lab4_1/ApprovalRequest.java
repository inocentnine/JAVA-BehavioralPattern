package lab4_1;

public class ApprovalRequest {
    private String PurchaseOrder;
    private int money;

    public ApprovalRequest(String PurchaseOrder,int money){
        this.PurchaseOrder=PurchaseOrder;
        this.money=money;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        PurchaseOrder = purchaseOrder;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPurchaseOrder() {
        return PurchaseOrder;
    }

    public int getMoney() {
        return money;
    }
}
