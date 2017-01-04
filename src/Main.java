import java.util.*;

public class Main {

    public static void main(String[] args) {
//        cw 14 przed klasą stack (ok. 340str)

        int lengthOfNumber = 6;

        int element = 1;

        LinkedList<Integer> list = new LinkedList<>();
        ListIterator<Integer> it = list.listIterator();

        list.add(element);


        System.out.println(it.hasNext());

        do {

            if (it.hasPrevious()) {
                list.add(element++);
            }


            lengthOfNumber--;
        } while(lengthOfNumber == 0);


        System.out.println(list);
    }
}
