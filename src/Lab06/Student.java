package Lab06;

public class Student extends Person{
    private int index;
    private String study;

    public Student(String firstName, String lastName, int age, int index, String study) {
        super(firstName, lastName, age);
        this.index = index;
        this.study = study;
    }
    public void view(){
        super.view();
        System.out.println("Index: " + index + " study: " + study);
    }
}
