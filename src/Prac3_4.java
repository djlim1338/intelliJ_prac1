import java.sql.Array;

public class Prac3_4 {
    public static void main(String args[]){
        final int IND1 = 3;
        final int IND2 = 3;
        int count = 100;
        int arr[][] = new int[IND1][IND2];

        for(int i = 0; i < IND1; i++){
            for(int j = 0; j < IND2; j++){
                arr[i][j] = count;
                count+=10;
            }
        }

        for(int i = 0; i < IND1; i++){
            for(int j = 0; j < IND2; j++) System.out.println("["+i+"]["+j+"] = " + arr[i][j]);
        }
    }
}
