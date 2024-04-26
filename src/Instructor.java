public class Instructor extends Employee { // مدرس = مدرب
    private  double hourPrice; // سعر الساعه
    private  double hours; // عدد ساعات العمل

    public Instructor() {
        System.out.println("Instructor Created");
    }
    public double getHourPrice() {
        return hourPrice;
    }
    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    public double calcTotalSalary() { // must override must write code
        return this.getBasicSalary() + this.hourPrice * this.hours;
    }
}
