import model.Person;

public class StringsLearn {
    public void saySmth(String message) {
        System.out.println(message);
    }
    
    public char middleName() {
        return middleName.charAt(0);
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public void test(String[] words) {

    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.firstName = "Jake";
        p1.lastName = "Smith";
        p1.sayHello();
        p1.saySmth("Hey buddy!");
        p1.saySmth("Cool test");
        System.out.println(p1.getFirstName());
        System.out.println(p1.add(5, 3));
        System.out.println(PI);
    }
}
