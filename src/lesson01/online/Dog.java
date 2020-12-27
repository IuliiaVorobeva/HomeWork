package lesson01.online;

public class Dog extends Animals{

    public Dog(String name, int run, double jump) {
        super(name, run, jump);
        this.swim = 0;
    }
    public Dog(String name, int run, double jump, int swim) {
        super(name, run, jump);
        this.swim = swim;
    }
}
