package Array.Easy;

public class Is_sorted {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3};
        System.out.println(isSorted(arr));
        /* here i have to find a partition
           where right side elements are greater
           and left side elements are also greater

        [3,4,5,1,2]
        first you take first element and check the next element is greater than or less than .
        if the element less than the current element than count++; if greater continue;

        1 % 5 = 1;
        2 % 5 = 2;
        3 % 5 = 3;
        5 % 5 = 0;

        with the help of module i can check rotate elements also;

        if count <= 1 return true
        else return false


        */
    }

    static boolean isSorted(int[] nums) {
        int count = 0;

        for(int i = 0; i<nums.length; i++){

            if(nums[i] > nums[(i+1) % nums.length]){
                count++;
            }
        }

        return count <= 1;
    }
}
