package Lab06;

public class Person {
    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void view(){
        System.out.println("Firstname: "+ firstName +
                " Lastname: " + lastName +
                " age: " + age);
    }
}
