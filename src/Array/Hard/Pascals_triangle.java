package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_triangle {
    public static void main(String[] args) {
        System.out.println(pascalsTriangle(5));
        System.out.println(4 / 5);
    }

    static List<List<Integer>> pascalsTriangle(int numRows) {

        // T.C -> O(row * col) S.C -> (row * col);
//        List<List<Integer>> parentList = new ArrayList<>();
//
//
//        for (int i = 0; i < numRows; i++) {
//            List<Integer> childList = new ArrayList<>();
//
//            for (int j = 0; j <= i; j++) {
//                int parent1 = 0, parent2 = 0;
//
//
//                if ((i - 1) >= 0 && (j - 1) >= 0) {
//                    parent1 = parentList.get(i - 1).get(j - 1);
//                }
//
//                if ((i - 1) >= 0 && (j) < parentList.get(i - 1).size()) {
//                    parent2 = parentList.get(i - 1).get(j);
//                }
//
//                if (parent1 == 0 && parent2 == 0) {
//                    childList.add(1);
//                } else {
//                    childList.add(parent1 + parent2);
//                }
//
//
//            }
//
//            parentList.add(childList);
//        }
//
//        return parentList;


        // More optimal
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i<=numRows; i++){
            List<Integer> childList = generateTriangle(i);
            ans.add(childList);
        }
        return ans;
    }

    static  List<Integer> generateTriangle (int row){

        int result = 1;

        List<Integer> childList = new ArrayList<>();
        childList.add(1);
        for(int col = 1; col<row; col++){
            result = result * (row - col);
            result = result / (col);
            childList.add(result);
        }

        return childList;
    }
}
