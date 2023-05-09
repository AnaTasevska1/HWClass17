package HWClass17;
/*
Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
 3 - from different class inside different package  and observe result.
 */
public class Task2 {
    private Task2() {
        System.out.println("Private constructor called.");
    }
    public Task2(int x) {
        System.out.println("Public constructor called with parameter: " + x);
    }
    Task2(String s) {
        System.out.println("Default constructor called with parameter: " + s);
    }
    protected Task2(boolean b) {
        System.out.println("Protected constructor called with parameter: " + b);
    }

    public static void main(String[] args) {
        Task2 obj1 = new Task2();

        Task2 obj2 = new Task2(66);

        AnotherClass obj3 = new AnotherClass();
        obj3.callProtectedConstructor();

        Task2 obj4 = new Task2("Ana");
    }
}
class AnotherClass {
    void callProtectedConstructor() {
        Task2 obj = new Task2(true);
    }
}

