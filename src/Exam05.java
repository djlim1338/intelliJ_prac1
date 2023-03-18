public class Exam05 {
    static int var = 100;
    public static void main(String args[]){
        int var = 0;
        System.out.println(var);

        System.out.println(addFunction(10, 20));
    }

    static int addFunction(int num1, int num2){
        return num1 + num2 + var;
    }
}
