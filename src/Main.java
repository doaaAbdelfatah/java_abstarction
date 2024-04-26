public class Main {

    public static void main(String[] args) {
        Instructor i1 = new Instructor();
        i1.setName("Ahmed");
        i1.setGender("Male");
        i1.setBasicSalary(1500);
        i1.setHours(40);
        i1.setHourPrice(50);

        System.out.println(i1.calcTotalSalary());

        System.out.println("-------------");

        SalesEmployee se = new SalesEmployee();
        se.setName("Sara");
        se.setGender("Female");
        se.setBasicSalary(1500);
        se.setTarget(50000);
        se.setCollectionAmount(70000);
        se.setCommission(0.1);
        System.out.println(se.calcTotalSalary());

        // abstract class for Ex. Employee can't be instantiated (can't create object)
//         Employee e = new Employee();

//        Person p = new Person();
//        p.setName("Dalia");
//        System.out.println(p.getName());

    }
}
