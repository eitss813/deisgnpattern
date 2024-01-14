package creational.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s1);

        System.out.print("This is not good");
        System.out.print("This is not good");
    }
}
