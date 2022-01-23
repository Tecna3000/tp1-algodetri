import java.util.ArrayList;
import java.util.List;

public class TriBulle {



    static void triParBulle(ArrayList<Integer> myList){
            int length =  myList.size();
            int first;
            for(int i=0; i < length; i++) {
                for(int j=1; j < (length-i); j++) {
                    if (myList.get(j - 1) > myList.get(j)) {

                        first = myList.get(j-1);
                        myList.set(j-1,myList.get(j));
                        myList.set(j, first);
                    }
                }
                    }
                }


}

