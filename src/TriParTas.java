import java.util.ArrayList;
import java.util.PriorityQueue;

public class TriParTas {
     static ArrayList<Integer> triParTas(ArrayList<Integer> list){
         PriorityQueue<Integer> queue = new PriorityQueue<>(list);
         ArrayList<Integer> sortedList= new ArrayList<>();
         for (int i = 0; i < list.size(); i++) {
             sortedList.add(queue.poll());
         }
         return sortedList;
     }




    // méthode pour permuter deux éléments dans une liste
    static void permute(ArrayList<Integer> list, int i, int j){
        int first = list.get(i);
        list.set(i,list.get(j));
        list.set(j,first);
    }
}
