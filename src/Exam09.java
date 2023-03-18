public class Exam09 {
    public static void main(String args[]){
        Automobile myAuto1 = new Automobile("무지개", 100);
        Automobile myAuto2 = new Automobile();

        System.out.println("\n"); // ---------------------------------------------------------------------------

        System.out.println("자동차의 최대 속도는 " + Car.MAX_SPEED + "km 입니다.");
        System.out.println("자동차의 최소 속도는 " + Car.MIN_SPEED + "km 입니다.");

        System.out.println("\n"); // ---------------------------------------------------------------------------

        myAuto1.printS();
        myAuto1.upSpeed(270);
        myAuto1.printS();
        myAuto1.downSpeed(20);
        myAuto1.printS();

        System.out.println("\n"); // ---------------------------------------------------------------------------

        myAuto2.printS();
        myAuto2.upSpeed(300);
        myAuto2.printS();
        myAuto2.downSpeed(10);
        myAuto2.printS();

        System.out.println("\n"); // ---------------------------------------------------------------------------
    }
}
