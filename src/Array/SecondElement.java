package Array;

public class SecondElement {
    public static void main(String[] args) {
        int[] arr = {10, 10,12, 13,10, 11, 10,10,9};
        System.out.println(findSecondElement(arr));
    }

    static int findSecondElement(int[] arr) {
        int maxElement = findMaxElement(arr);
        System.out.println(maxElement);
        int secondElement = -1;
        for (int j : arr) {

            if (maxElement > j) {
                if(secondElement < j){
                    secondElement = j;
                }

            }
        }

        return secondElement;
    }

    private static int findMaxElement(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }


        }

        return max;
    }
}
