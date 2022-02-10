import java.util.ArrayList;

public class QuickSort {
    public static void quickSort(ArrayList<Integer> list){
        quickSortmain(list,0,list.size()-1);


    }
    public static void quickSortmain(ArrayList<Integer> list, int start, int end){
        if(start<end)
        {
            int pivotPosition =partition(list,start,end,start);
            quickSortmain(list,start,pivotPosition-1);
            quickSortmain(list,pivotPosition+1,end);
        }

    }

    public static int partition (ArrayList<Integer> list, int start, int end, int pivot){

        int  smallerPos = pivot;
        int cmp = pivot + 1;
        int biggerPos = end+1;
        while(cmp<biggerPos){

            if (list.get(cmp)< list.get(pivot)){
                permute(list,cmp,smallerPos);
                smallerPos++;
                cmp++;
                pivot++;
            }
            else if(list.get(cmp) >list.get(pivot)){
                permute(list,cmp, biggerPos-1);
                biggerPos--;
            }
            else {
                pivot++;
                cmp++;

            }
        }
        return pivot;
    }

    // méthode pour permuter deux éléments dans une liste
    static void permute(ArrayList<Integer> list,int i,int j){
        int first = list.get(i);
        list.set(i,list.get(j));
        list.set(j,first);
    }
}
//O(n log n)