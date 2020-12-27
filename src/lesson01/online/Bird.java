package lesson01.online;

public class Bird extends Animals{
    public Bird(String name, int run, double jump) {
        super(name, run, jump);}

    @Override
    public void swim(int distanceSwim) {
        System.out.println(name + " я не умею !!!");
    }
}
