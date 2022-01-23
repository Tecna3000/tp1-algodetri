import java.util.ArrayList;
import java.util.LinkedList;

public class TriFusion {

    public static void triParFusion(LinkedList<Integer> list) {
        LinkedList<Integer> left= new LinkedList();
        LinkedList<Integer> right = new LinkedList();
        for (int i = 0; i < list.size()/2; i++) {
            left.add(list.get(i));
        }
        for (int i = list.size()/2; i < list.size(); i++) {
            right.add(list.get(i));
        }

    }


}
