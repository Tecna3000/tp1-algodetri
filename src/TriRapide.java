import java.util.ArrayList;

public class TriRapide {
    public static void triRapide(ArrayList<Integer> list){
     partition(list);
    }

    public static void partition (ArrayList<Integer> list){

        int pivot = list.get(0);
        int smaller = 1;
        int n = list.size();
        int i = 1;

        while(i <=n-1){
            if(list.get(i)==pivot){
            i++;
            }
            if (list.get(i)> pivot){
                permute(list,i,i+1);
                n--;
            }
            if(list.get(i) <pivot){
                permute(list,i, 1-1);
                i++;
                list.set(i-1,pivot);
            }


        }


    }

    // méthode pour permuter deux éléments dans une liste
    static void permute(ArrayList<Integer> list,int i,int j){
        int first = list.get(i);
        list.set(i,list.get(j));
        list.set(j,first);
    }
}
