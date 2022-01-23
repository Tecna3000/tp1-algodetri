import java.util.LinkedList;

public class TriFusion {

    public static LinkedList<Integer> triParFusion(LinkedList<Integer> list) {
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        LinkedList<Integer> leftSorted ;
        LinkedList<Integer> rightSorted ;
        LinkedList<Integer> listMerged ;
        if (list.size()>1) {
            //diviser en deux sous-listes
            for (int i = 0; i < list.size() / 2; i++) {
                left.add(list.get(i));
            }
            for (int j = list.size() / 2; j < list.size(); j++) {
                right.add(list.get(j));
            }
            leftSorted = triParFusion(left); // trier la liste de gauche
            rightSorted = triParFusion(right);
            listMerged = fusion(leftSorted, rightSorted); // fusionner les deux sous listes triés
        }
        else{
            return list;
        }
        return listMerged;
    }

    public static LinkedList <Integer> fusion(LinkedList<Integer> left, LinkedList<Integer> right){
        LinkedList<Integer> mergedList = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size() ) {
            if (left.get(i) <= right.get(j)) {
                mergedList.add(left.get(i));
                i++;
            } else {
                mergedList.add(right.get(j));
                j++;
            }
        }
        // ajouter les élements restants
        while (i < left.size()){
            mergedList.add(left.get(i));
            i++;
        }
        while (j < right.size()){
            mergedList.add(right.get(j));
            j++;
        }
        return mergedList;
    }
}
