package lesson01.online;

public class Horse extends Animals {

    public Horse(String name, int run, int jump) {
        super(name, run, jump);
        this.swim=0;
    }
    public Horse (String name, int run, int jump, int swim){
        super(name, run, jump);
        this.swim = swim;

    }
}
