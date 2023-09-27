package recurrsion;

public class Flip_game {

    public static void main(String[] args) {
        System.out.println(canNinjaWin("$$$$"));
    }

    public static boolean canNinjaWin(String str) {


        if(str.length() < 2){
            return false;
        }


        for(int i = 0; i<str.length() - 1; i++){

            if(str.charAt(i) == '$' && str.charAt(i+1) == '$'){
                String newString = str.substring(0,i)+"**"+str.substring(i+2);

                if(!canNinjaWin(newString)){
                    return true;
                }
            }


        }


        return false;
    }
}
