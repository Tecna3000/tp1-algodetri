import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String args[]) {

        ArrayList<Integer> mylist = new ArrayList<>();
        int min = 0;
        int max = 50;
        int length = 10;
        mylist= randomGenerator(length,max,min);
        System.out.println(mylist);
        TriBulle.triParBulle(mylist);
        System.out.println(mylist);


    }
    public static ArrayList<Integer> randomGenerator(int length, int max , int min ){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i, (int) (Math.random() * (max-min)));
        }
        return list;
    }

}