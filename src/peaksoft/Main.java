package peaksoft;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[100];

        ArrayList<Integer> arrayList = new ArrayList<>();

        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }



        System.out.println(sort(arrayList));

        System.out.println(Arrays.toString(sort(randomNumbers)));

        System.out.println(sort(linkedList));



    }
    public static ArrayList<Integer> sort (ArrayList<Integer> arrayList) {

        ArrayList<Integer> sorted = arrayList;

        Collections.sort(sorted);

        return sorted;
    }
    public static LinkedList<Integer> sort (LinkedList<Integer> linkedList) {

        LinkedList<Integer> sorted = linkedList;

        Collections.sort(sorted);

        return sorted;
    }
    public static int[] sort (int[] ints) {

        int[] sorted = ints;

        Arrays.sort(sorted);

        return sorted;
    }
}
