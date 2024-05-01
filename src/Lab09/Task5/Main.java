package Lab09.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<Integer>();
        List<Integer> integerList2 = new ArrayList<Integer>();

        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);

        integerList2.add(4);
        integerList2.add(5);
        integerList2.add(6);
        integerList2.add(7);

        ListIterator<Integer> li = integerList1.listIterator(integerList1.size());
        while (li.hasPrevious()){
            integerList2.add(li.previous());
        }
        for (Integer item : integerList2){
            System.out.println(item);
        }
    }
}
