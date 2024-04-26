package demo;

public class Main {

    public static void main(String[] args) {
        Hello h = new Hello();
        System.out.println(h.print("Doaa"));

        Welcome w = new Welcome();
        System.out.println(w.print("Sara"));

        Congratulation c =  new Congratulation();
        System.out.println(c.print("Ahmed"));
    }
}
