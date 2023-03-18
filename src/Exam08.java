public class Exam08 {
    public static void main(String args[]){
        Car myCar1 = new Car("빨강", 0);
        Car myCar2 = new Car("파랑", 0);
        Car myCar3 = new Car("초록", 0);

        Automobile myAuto1 = new Automobile("무지개", 100);
        Automobile myAuto2 = new Automobile();

        System.out.println("\n"); // ---------------------------------------------------------------------------

        System.out.println("자동차의 최대 속도는 " + Car.MAX_SPEED + "km 입니다.");
        System.out.println("자동차의 최소 속도는 " + Car.MIN_SPEED + "km 입니다.");

        System.out.println("\n"); // ---------------------------------------------------------------------------

        System.out.println("생성된 자동차의 수는 " + Car.carCount + "대 입니다.");
        System.out.println("생성된 자동차의 수는 " + Car.getCarCount() + "대 입니다.");

        System.out.println("\n"); // ---------------------------------------------------------------------------
    }
}
