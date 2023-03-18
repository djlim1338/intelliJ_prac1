import java.util.ArrayList;

public class Prac3_8 {
    public static void main(String args[]){
        ArrayList<Object> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add("3");

        int hap=0;
        for(int i=0; i< numList.size(); i++) {
            hap +=  Integer.parseInt(numList.get(i).toString());
        }
        System.out.print( hap );
    }
}
