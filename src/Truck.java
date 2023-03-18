public class Truck extends Car{
    final int MAX_SPEED = 150;
    int cc;
    final int YEAR = 2013;

    public Truck(int cc){this.cc = cc;}

    int getCc() {return cc;}

    @Override
    void upSpeed(int value) {
        if(speed + value > this.MAX_SPEED) speed = this.MAX_SPEED;
        else speed += value;
    }
}
