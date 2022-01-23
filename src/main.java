import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class main {
    public static void main(String args[]) {

        ArrayList<Integer> myList;
        myList = randomGenerator(10,50,0);
        System.out.println(myList);
        TriBulle.triParBulle(myList);
        System.out.println(myList);


        //tri par fusion
        /*LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(myList);
        System.out.println(linked);
        LinkedList<Integer> sorted = TriFusion.triParFusion(linked);
        System.out.println(sorted);*/
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