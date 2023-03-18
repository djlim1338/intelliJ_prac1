import java.util.ArrayList;
import java.util.List;

public class Prac3_8_2 {
    public static void main(String args[]){
        List<Object> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add("3");
        numList.add('4');
        Integer tmp = 0;

        int hap=0;
        for(int i=0; i < numList.size(); i++) {
            hap +=  Integer.parseInt(numList.get(i).toString());
            System.out.println("List size : " + numList.size());
            System.out.println("data : " + numList.get(i));
            System.out.println("data type : " + numList.get(i).getClass().getName());
            tmp = Integer.parseInt(numList.get(i).toString());
            System.out.println("data type : " + tmp.getClass().getName());
            System.out.println("");
        }
        System.out.print( hap );
    }
}
