package Lab09.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Participants> participants = new ArrayList<Participants>();
        participants.add(new Participants(1, "Jan", 40));
        participants.add(new Participants(2, "Naj", 18));
        participants.add(new Participants(3, "Ala", 9));
        participants.add(new Participants(4, "Ola", 22));

        for (Participants item : participants){
            System.out.println("Participant: " + item.toString());
        }
        Participants participant = participants.getFirst();
        participant = new Participants(1, "Jan", 40);
        if (participants.getFirst().equals(participant)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(participants.hashCode());

        participants.removeIf(item -> item.getAge() < 18);

        for (Participants item : participants){
            System.out.println("Participant: " + item.toString());
        }

    }
}
