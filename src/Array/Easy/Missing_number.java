package Array.Easy;

public class Missing_number {

    public static void main(String[] args) {
        int[] arr ={1,0,3};
        System.out.println(missing_number(arr));

    }

    public  static  int missing_number(int[] nums){
             int i = 0;

         while(i < nums.length){
             int correctIndex = nums[i] - 1;

             if( nums[i] > 0 && nums[i] != nums[correctIndex]){
                 int temp = nums[correctIndex];
                 nums[correctIndex] = nums[i];
                 nums[i] = temp;
             }else{
                 i++;
             }

         }



 // all element find their right index;
 //  array will be [1,0,3]

      int result = 0;

      for(int j = 0; j< nums.length; j++){

        if(j+1 != nums[j]){
            result = j+1;
            break;
        }
      }

      return result;
}
}
