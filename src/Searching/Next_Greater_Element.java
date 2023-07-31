package Searching;

public class Next_Greater_Element {

    public static void main(String[] args) {
        char[] letters = {'c','f','z'};
        System.out.println(nextGreatestLetter(letters, 'b'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;


        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target >= letters[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        // when target is greater than all elements
        return letters[start % letters.length];

    }
}
