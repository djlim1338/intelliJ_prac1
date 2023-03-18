public class Automobile extends Car{
    int seatNum;

    static final int MAX_SPEED = 300;

    int getSeatNum(){return seatNum;}

    public Automobile(String color, int speed){
        super(color, speed);
    }

    public Automobile(){super();}

    @Override
    void upSpeed(int value){
        if(speed + value > MAX_SPEED) speed = MAX_SPEED;
        else speed += value;
    }
}
