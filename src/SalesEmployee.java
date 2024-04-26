public class SalesEmployee extends Employee {
    private  double commission; // العموله نسيه مئويه
    private  double collectionAmount; // التحصيل
    private double target; // الهدف

    public SalesEmployee() {
        System.out.println("Sales Employee Created");
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public double calcTotalSalary() { // must override
        if (this.collectionAmount >= this.target) {
            return  this.getBasicSalary() + this.commission * this.collectionAmount;
        }else{
           return  this.getBasicSalary();
        }
    }
}
