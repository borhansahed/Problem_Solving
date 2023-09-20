package Backtracking;

public class Grid {
    public static void main(String[] args) {
        gridPath(
                4,4,"");
    }
    private static void gridPath(int row, int col, String s){

        if(row == 1 && col == 1){
            System.out.println(s);
            return;
        }

        if(col > 1){
            gridPath(row, col-1, s+"R");
        }
        if(row > 1){
            gridPath(row-1, col, s+"D");
        }

    }
}
