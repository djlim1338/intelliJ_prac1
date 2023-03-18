
interface iAnimal{
    abstract void eat();
}

public class Exam12 {
    public static void main(String args[]){
        ICat cat = new ICat();
        cat.eat();

        ITiger tiger = new ITiger();
        tiger.move();
        tiger.eat();
    }

    static class ICat implements iAnimal{
        @Override
        public void eat() {System.out.println("생선을 좋아한다.");}
    }

    static class ITiger extends Animal implements iAnimal{
        void move() {System.out.println("네발로 이동한다.");}
        @Override
        public void eat() {System.out.println("멧돼지를 잡아먹는다.");}
    }
}
