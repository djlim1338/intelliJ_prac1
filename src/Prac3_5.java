public class Prac3_5 {
    static int data = 100;
    public static void main(String args[]){
        int data = 200;
        data++;
        System.out.println(data);
        func1(data);
    }
    static void func1(int data){
        data++;
        System.out.println(data);
    }
}
