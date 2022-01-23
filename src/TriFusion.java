import java.lang.reflect.Array;
import java.util.LinkedList;

public class TriFusion {

    public static LinkedList<Integer> triParFusion(LinkedList<Integer> list) {
        LinkedList<Integer> left = new LinkedList();
        LinkedList<Integer> right = new LinkedList();
        LinkedList<Integer> listSorted = new LinkedList();
        if (list.size()>1) {

            for (int i = 0; i < list.size() / 2; i++) {
                left.add(list.getFirst());
            }
            for (int i = list.size() / 2; i < list.size(); i++) {
                right.add(list.getFirst());
            }
        }

        LinkedList<Integer> leftSorted = triParFusion(left);
        LinkedList<Integer> rightSorted = triParFusion(right);


        return listSorted;
    }

    public static LinkedList <Integer> fusion(LinkedList<Integer> left, LinkedList<Integer> right){
        LinkedList<Integer> mergedList = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size() ) {
            if (left.getFirst() <= right.getFirst()) {
                mergedList.add(left.getFirst());
                i++;
            } else {
                mergedList.add(right.getFirst());
                j++;
            }
        }
        return mergedList;
    }


}
