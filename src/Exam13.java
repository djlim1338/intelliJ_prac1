
interface clickListener{
    public void print();
}
public class Exam13 {
    public static void main(String args[]){
        clickListener listener = (new clickListener() {
            @Override
            public void print() {
                System.out.println("클릭 리스너 입니다.");
            }
        });

        listener.print();
    }
}
