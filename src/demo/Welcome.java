package demo;

public class Welcome extends Greeting{
    @java.lang.Override
    public String print(String name) {
        return "Welcome " + name;
    }
}
