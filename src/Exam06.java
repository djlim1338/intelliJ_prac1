public class Exam06 {
    public static void main(String args[]){
        int num1 = 100, num2 = 0;
        try{
            System.out.println(num1/num2);
        }
        catch (java.lang.ArithmeticException e){
            System.out.println("에러가 발생하였습니다. : ");
            System.out.println(e);
        }
    }
}
