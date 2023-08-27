package Searching;



public class Book_Allocation {
    public static void main(String[] args) {

        int[] pages = {12,34,67,90};
        System.out.println(findPages(pages, 4, 5));
    }
    public static int findPages(int[]A,int N,int M)
    {

        if(N < M) return -1;
      int start = 0;
      int end = 0;

      for(int page: A){
          end +=page;
      }



      while (start <= end){

          int mid = start + (end - start) /2;

          if(isPossible(A,M, mid)){

              end = mid - 1;
          }else{
              start = mid +1;
          }
      }
      return start;
    }

    public  static boolean isPossible(int[] A, int m, int mid){

        int studentCount = 1;
        int pageSum = 0;

        for(int i = 0; i<A.length; i++){

            if((A[i] + pageSum) <= mid){
                pageSum += A[i];
            }else{
                studentCount++;
                if(studentCount > m || A[i] > mid)return false;

                pageSum = A[i];
            }
        }

        return true;
    }
}
