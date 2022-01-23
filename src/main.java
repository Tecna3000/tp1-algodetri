import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class main {
    public static void main(String args[]) {

        ArrayList<Integer> myList;
        myList = randomGenerator(10,50,0);
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(myList);
        System.out.println(linked);
        LinkedList<Integer> sorted = TriFusion.triParFusion(linked);
        System.out.println(sorted);

        /*ArrayList<Integer>left = randomGenerator(10,50,0);
        ArrayList<Integer>right = randomGenerator(10,50,0);
        LinkedList<Integer> link1= new LinkedList<>();
        LinkedList<Integer> link2= new LinkedList<>();
        link1.addAll(left);
        link2.addAll(right);
        System.out.println(left);
        System.out.println(right);
        TriBulle.triParBulle(myList);

        LinkedList<Integer> result = TriFusion.fusion(link1,link2);
        //System.out.println(myList);
        System.out.println(result);*/

    }

    public static ArrayList<Integer> randomGenerator(int length, int max , int min ){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            //list.add(i, (int) (Math.random() * (max-min)));
            Random random = new Random();
            list.add(i,random.nextInt(max - min + 1) + min);
        }
        return list;
    }

}