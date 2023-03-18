public class Car {
    String color = "무색";  // 색
    int speed = 0;  // 속도
    static int carCount = 0;  // 생성된 자동차 수
    int carNum;  // 자동자 번호

    static final int MAX_SPEED = 200;
    static final int MIN_SPEED = 0;

    public Car(String color, int speed){
        this.color = color;
        this.speed = speed;
        addCar();
        carNum = getCarCount();
    }
    public Car(){
        addCar();
        carNum = getCarCount();
    }

    static void addCar(){carCount++;}
    static void delCar(){carCount--;}
    String getColor(){return color;}
    int getSpeed(){return speed;}
    static int getCarCount(){return carCount;}

    void upSpeed(int value){
        if(speed + value > MAX_SPEED) speed = MAX_SPEED;
        else speed += value;
    }

    void downSpeed(int value){
        if(speed - value < MIN_SPEED) speed = MIN_SPEED;
        else speed -= value;
    }

    void printS(){
        System.out.println(carNum + "번 자동차의 색은 " + color + "이며, 속도는 " + speed + "km 입니다.");
    }
}
