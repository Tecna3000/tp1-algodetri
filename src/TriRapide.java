import java.util.ArrayList;

public class TriRapide {
    public static ArrayList< Integer> triRapide(ArrayList<Integer> list, int smallerPos, int biggerPos){
        if(smallerPos<biggerPos)
        {
            int pivotPosition =partition(list,smallerPos,biggerPos);
            triRapide(list,smallerPos,pivotPosition-1);
            triRapide(list,pivotPosition+1,biggerPos);
        }
       return list;
    }

    public static int partition (ArrayList<Integer> list, int smallerPos, int biggerPos){

        int pivotPos =smallerPos;
        int i =  1;
        int n = biggerPos;
        while(i <= n-1){

            if (list.get(i)< list.get(pivotPos)){
                permute(list,i,pivotPos);
                i++;
            }
            else if(list.get(i) >list.get(pivotPos)){
                permute(list,i, n-1);
                n--;
            }
            else{
                pivotPos++;
                i++;
            }
        }
        return pivotPos;
    }

    // méthode pour permuter deux éléments dans une liste
    static void permute(ArrayList<Integer> list,int i,int j){
        int first = list.get(i);
        list.set(i,list.get(j));
        list.set(j,first);
    }
}
