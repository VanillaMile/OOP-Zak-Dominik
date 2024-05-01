package Lab09.Task3;

public class Participants {
    int ID;
    String Name;
    int age;

    public Participants(int ID, String name, int age) {
        this.ID = ID;
        Name = name;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return ID + " " + Name + " " + age;
    }
}
