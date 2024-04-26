public abstract class Employee extends Person {
    private  double basicSalary;
    private String job;
    public Employee() {
        System.out.println("Employee Created");
    }

    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public abstract double calcTotalSalary(); // مجرده no code
}
