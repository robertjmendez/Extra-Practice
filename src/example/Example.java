package example;

public class Example {
    String greeting;

    public void sayHello() {
        System.out.println(this.greeting);
    }

    public Example(String greeting) {
        this.greeting = greeting;
    }
}
