package DSA;

import java.util.LinkedList;

public class Tests {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(4);
        list.add(6);
        list.add(9);


        LinkedList<Object> revesedList = reversedLinkedList(list);


        // Test the LinkedList class
        System.out.println("printed list " + list);
        System.out.println("printed reversedList " + revesedList);

    }

    /** * a function that takes a linked list and returns a reversed linked list with manual iteration
     *
     * @param list
     * @return
     */
    static LinkedList<Object> reversedLinkedList(LinkedList list) {
        var currentLength = list.size();
        LinkedList<Object> reversedList = new LinkedList<>();

        for (var i : list) {
            if (currentLength >= 0) {
                reversedList.add(list.get(currentLength - 1));
                currentLength--;
            } else {
                break;
            }
            System.out.println(i);
        }
        return reversedList;
    }
}
