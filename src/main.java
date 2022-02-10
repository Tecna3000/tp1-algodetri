import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String args[]) {
        ArrayList<Integer> myList;
        myList = randomGenerator(100000,10,0);//145899
        System.out.println(myList);
        //tri par bulle
        /*BubbleSort.bubbleSort(myList);
        System.out.println("list sorted with bubblesort: " + myList);*/

       //triParTas
        /*ArrayList<Integer> sorted =HeapSort.heapSort(myList);
        System.out.println("list sorted with heapsort: " + sorted);*/

        //triRapide
        QuickSort.quickSort(myList);
        System.out.println("list sorted with quicksort: " + myList);

        //tri par fusion
       /* LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(myList);
        System.out.println(linked);
        LinkedList<Integer> sorted = MergeSort.mergeSort(linked);
        System.out.println("list sorted with mergesort: " + sorted);*/
    }

    public static ArrayList<Integer> randomGenerator(int length, int max , int min ){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i, (int) (Math.random() * (max-min)));
            //Random random = new Random();
            //list.add(i,random.nextInt(max - min + 1) + min);
        }
        return list;
    }
}