package creational.builder;

public class Client {
    public static void main(String[] args) {

        Student s = Student.getBuilder().setName("Raja").setId(1).setRollNumber(45678).build();

        System.out.println(s);

    }
}
