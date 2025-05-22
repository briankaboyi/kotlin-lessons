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
        System.out.println("the max of two numbers is " + maxOfTwo(5, 10));
        System.out.println("the array contains num " + containsInt(new int[]{1, 2, 3, 4, 5}, 0));
        System.out.println("the factorial of 5 is " + factorial(5));

        int[] myArray = {1, 2, 3, 4, 5};
       System.out.println("the max of the array is " + maxInt(myArray));

    }

    /**
     * a function that takes a linked list and returns a reversed linked list with manual iteration
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

    /**
     * a function that takes two numbers and returns the max of the two
     *
     * @param a
     * @param b
     * @return
     */
    static int maxOfTwo(int a, int b) {
        return Math.max(a, b);
    }


    /**
     * a function that takes an array and a number and returns true if the number is in the array
     *
     * @param arr
     * @param num
     * @return
     */
    static Boolean containsInt(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    static int factorial(int n) {

        int currentNum = n;

        for (int i = n - 1; i >= 1; i--) {
            currentNum *= i;

        }
        return currentNum;
    }

    static int maxInt(int[] myArray){
        int max = myArray[0];
        for(var i: myArray){
            if( i > max){
                max = i;
            }
        }
        return max;
    }
}
