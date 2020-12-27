package lesson01.online;

public class Cat extends Animals{

    public Cat(String name, int run, int jump) {
        super(name, run, jump);
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println(name + " я не умею плавать!!!");
    }
}
