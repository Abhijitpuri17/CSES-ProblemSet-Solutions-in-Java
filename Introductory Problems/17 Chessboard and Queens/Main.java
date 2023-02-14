import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;

    static boolean isSafe(char[][] board, int row, int col) {
        for(int i = 0; i < 8; i++){
            if(i != col && board[row][i] == 'Q'){
                return false ;
            }
            if(i != row && board[i][col] == 'Q'){
                return false ;
            }
        }
        int i = row+1, j = col+1 ;
        while (i < 8 && j < 8){
            if(board[i][j] == 'Q'){
                return false;
            }
            i++;
            j++ ;
        }
        i = row-1; j = col+1 ;
        while (i >= 0 && j < 8){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j++ ;
        }
        i = row-1; j = col-1 ;
        while (i >= 0 && j >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j-- ;
        }
        i = row+1; j = col-1 ;
        while (i < 8 && j >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i++;
            j-- ;
        }
        return true ;
    }

    static int solve(char[][] board, int row) {
        if(row == 8) {
            return 1 ;
        }
        int ways = 0 ;
        for(int col = 0; col < 8; col++){
            if(board[row][col] == '*'){
                continue;
            }
            board[row][col] = 'Q' ;
            if(isSafe(board, row,col))
                ways += solve(board, row+1) ;
            board[row][col] = '.' ;
        }
        return ways;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        char[][] arr = new char[8][8] ;
        for(int i = 0; i < 8; i++){
            arr[i] = sc.next().toCharArray() ;
        }
        out.println(solve(arr, 0));
        out.flush();
    }
}
