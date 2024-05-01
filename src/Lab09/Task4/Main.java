package Lab09.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ObjectsOfList> objectsOfLists = new ArrayList<ObjectsOfList>();

        objectsOfLists.add(new ObjectsOfList(1,"a"));
        objectsOfLists.add(new ObjectsOfList(2,"b"));
        objectsOfLists.add(new ObjectsOfList(3,"c"));
        objectsOfLists.add(new ObjectsOfList(4,"d"));
        objectsOfLists.add(new ObjectsOfList(5,"e"));
        objectsOfLists.add(new ObjectsOfList(6,"f"));

        List<ObjectsOfList> subObjectsOfLists = objectsOfLists.subList(3, objectsOfLists.size());

        for (ObjectsOfList item : objectsOfLists){
            System.out.println(item.toString());
        }
        objectsOfLists.removeAll(subObjectsOfLists);
        System.out.println("+++++++=================++++++++++");
        for (ObjectsOfList item : objectsOfLists){
            System.out.println(item.toString());
        }
    }
}
