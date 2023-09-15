package recurrsion;

public class Friends_Pair {
    public static void main(String[] args) {

        System.out.println(countFriendsPairings(4));

    }

    public static long countFriendsPairings(int n)
    {
        if(n <= 2){
            return n;
        }

        return countFriendsPairings(n-1) + (n-1) * countFriendsPairings(n-2);
    }
}
